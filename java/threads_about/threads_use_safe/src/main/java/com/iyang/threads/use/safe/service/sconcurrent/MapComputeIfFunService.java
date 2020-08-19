package com.iyang.threads.use.safe.service.sconcurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.util.StopWatch;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Yang
 * @date 2020/8/17 / 16:55
 */


public class MapComputeIfFunService {

    private final static Logger LOGGER = LoggerFactory.getLogger(MapComputeIfFunService.class);

    /**
     * 总元素数量
     */
    private static int ITEM_COUNT = 1000;

    /**
     * 循环次数
     */
    private static int LOOP_ITEM = 10000000;

    public static void main(String[] args) throws Exception {
        MapComputeIfFunService s = new MapComputeIfFunService();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("normaluse");
        stopWatch.stop();
        Map<String, Long> normaluse = s.mapAdd();
        Assert.isTrue(normaluse.size() == ITEM_COUNT, "normaluse size error");
        Assert.isTrue(normaluse.values().stream().mapToLong(aLong -> aLong)
                .reduce(0, Long::sum) == LOOP_ITEM, "normaluse count error");

        stopWatch.start("gooduse");
        Map<String, Long> addMap = s.parallelAdd();
        stopWatch.stop();
        Assert.isTrue(addMap.size() == ITEM_COUNT, "gooduse size error");
        Assert.isTrue(addMap.values().stream().mapToLong(aLong -> aLong)
                .reduce(0, Long::sum) == LOOP_ITEM, "gooduse count error");
        LOGGER.info(stopWatch.prettyPrint());

    }


    private Map<String, Long> mapAdd() throws Exception {
        ConcurrentHashMap<String, Long> freqs = new ConcurrentHashMap<>(ITEM_COUNT);
        int THREAD_COUNT = 10;
        ForkJoinPool forkJoinPool = new ForkJoinPool(THREAD_COUNT);
        forkJoinPool.execute(() -> IntStream.rangeClosed(1, LOOP_ITEM).parallel().forEach((i) -> {
            String key = "item" + ThreadLocalRandom.current().nextInt(ITEM_COUNT);
            synchronized (freqs) {
                if (freqs.contains(key)) {
                    freqs.put(key, freqs.get(key) + 1);
                } else {
                    freqs.put(key, 1L);
                }
            }
        }));
        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(1, TimeUnit.HOURS);
        return freqs;
    }


    private Map<String, Long> parallelAdd() throws Exception {

        ConcurrentHashMap<String, LongAdder> freqs = new ConcurrentHashMap<>(ITEM_COUNT);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(() -> IntStream.rangeClosed(1, LOOP_ITEM).parallel().forEach((i) -> {
            String key = "item" + ThreadLocalRandom.current().nextInt(ITEM_COUNT);
            freqs.computeIfAbsent(key, k -> new LongAdder()).increment();
        }));

        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(1, TimeUnit.HOURS);

        return freqs.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().longValue()));

    }

}
