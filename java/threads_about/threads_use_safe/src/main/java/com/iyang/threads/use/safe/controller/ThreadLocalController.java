package com.iyang.threads.use.safe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @Author: Mu_Yi
 * @Date: 2020/8/16 10:27
 * @Version 1.0
 * @qq: 1411091515
 */

@RestController
@RequestMapping("/threadlocal")
public class ThreadLocalController {

    private static Logger LOGGER = LoggerFactory.getLogger(ThreadLocalController.class);


    /**
     * ThreadLocal 使用需要即使清除,不然如果是线程池中的线程的话,就会出现意想不到的bug来
     */
    private ThreadLocal<Integer> currentUser = ThreadLocal.withInitial(() -> null);

    /**
     * 线程个数
     */
    private static int THREAD_COUNT = 10;

    /**
     * 总元素数量
     */
    private static int ITEM_COUNT = 1000;

    /**
     * 循环次数
     */
    private static int LOOP_ITEM = 10000000;

    @SuppressWarnings("all")
    private ConcurrentHashMap<String,Long> getData(int count){
        return LongStream.rangeClosed(1,count)
                         .boxed()
                         .collect(Collectors.toConcurrentMap(i->UUID.randomUUID().toString(), Function.identity(),
                                 (o1,o2) -> o1,ConcurrentHashMap::new));
    }

    /**
     * 如果配置 server.tomcat.threads.max=1 的话,那么就只有一个线程,那么上次的值就会覆盖掉.
     * 所以在使用 ThreadLocal 的时候,最后是要进行 remove 即可.
     * 否则就可能出现,当如果是线程池的话,就可能会复用到之前的内容.
     * 如果不清楚的话,是有可能会出现 内存泄漏 问题的.
     *
     * @param userId
     * @return
     */
    @GetMapping("/wrong")
    public Object wrong(@RequestParam("userId") Integer userId ){
        String before = Thread.currentThread().getName() + ":" + currentUser.get();
        currentUser.set(userId);
        String after = Thread.currentThread().getName() + ":" + currentUser.get();
        Map result = new HashMap();
        result.put("before",before);
        result.put("after",after);
        return result;
    }

    /**
     * 如果频繁的刷新会看到一个奇怪的效果.
     * @return
     * @throws Exception
     */
    @GetMapping("/concurrentHashMap")
    public Object concurrentHashMapWrong() throws Exception {

        ConcurrentHashMap<String, Long> data = getData(ITEM_COUNT - 100);
        LOGGER.info("init size() ---> {} " , data.size());

        ForkJoinPool forkJoinPool = new ForkJoinPool(THREAD_COUNT);
        // 使用并发线程池模拟处理逻辑
        forkJoinPool.execute(() -> IntStream.rangeClosed(1,10).parallel().forEach(i -> {
            // 查询需要补充的元素
            // 使用 synchronized 来进行加锁.
            synchronized (data){
                int gap = ITEM_COUNT - data.size();
                LOGGER.info(" the gap size : {} " , gap);
                // 进行补充元素
                data.putAll(getData(gap));
            }
        }));

        // 等待所有任务完成
        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(1, TimeUnit.HOURS);
        /// 打印出最后的元素
        LOGGER.info("finish size : {} " , data.size());
        return "ok";
    }


    @GetMapping("/map-add")
    public void mapAdd() throws Exception {
        ConcurrentHashMap<String,Long> freqs = new ConcurrentHashMap<>(ITEM_COUNT);
        ForkJoinPool forkJoinPool = new ForkJoinPool(THREAD_COUNT);
        forkJoinPool.execute(() -> IntStream.rangeClosed(1,LOOP_ITEM).parallel().forEach((i) -> {
            String key = "item" + ThreadLocalRandom.current().nextInt(ITEM_COUNT);
            synchronized (freqs){
                if(freqs.contains(key)){
                    freqs.put(key,freqs.get(key) + 1);
                } else {
                    freqs.put(key,1L);
                }
            }
        }));
        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(1,TimeUnit.HOURS);
    }


    @GetMapping("/parallel-add")
    public void parallelAdd() throws Exception {

        ConcurrentHashMap<String,LongAdder> freqs = new ConcurrentHashMap<>(ITEM_COUNT);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(() -> {
            IntStream.rangeClosed(1,LOOP_ITEM).parallel().forEach((i) -> {
                String key = "item" + ThreadLocalRandom.current().nextInt(ITEM_COUNT);
                freqs.computeIfAbsent(key,k -> new LongAdder()).increment();
            });
        });

        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(1,TimeUnit.HOURS);

        Map<String, Long> collect = freqs.entrySet().stream()
                                         .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().longValue()));

    }


}
