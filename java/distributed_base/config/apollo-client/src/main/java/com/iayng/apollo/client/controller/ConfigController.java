package com.iayng.apollo.client.controller;


import com.iayng.apollo.client.service.PriceServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

@RestController
@RequestMapping
public class ConfigController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigController.class);

    /**
     * 创建线程池
     */
    public static ExecutorService FIXED_THREAD_POOL = Executors.newFixedThreadPool(10);

    @Value("sdad:yang")
    private String yang;

    @Autowired
    private PriceServiceImpl priceService;

    @GetMapping("/deferredresult")
    public DeferredResult<String> deferredResult() throws Exception {
        System.out.println("控制层线程Info ---> " + Thread.currentThread().getName());

        DeferredResult<String> deferredResult  =new DeferredResult<>();
        deferredResult.onTimeout(() -> {
            System.out.println("异步线程执行超时");
            deferredResult.setResult("线程执行事件");
        });

        deferredResult.onCompletion(() -> {
            System.out.println("异步执行完毕");
        });

        FIXED_THREAD_POOL.execute(() -> {
            System.out.println("异步执行线程 --> " + Thread.currentThread().getName());

            try{

                String task2 = priceService.task2();
                Thread.sleep(1000);
                deferredResult.setResult("这是[异步]的请求返回: " + task2);
            }catch (Exception e){
                e.printStackTrace();
            }

        });
        return deferredResult;
    }

    /**
     * 函数式编程操作
     */
    private final Function<List<?>,Integer> COUNT_LIST = lists -> {
        if(CollectionUtils.isEmpty(lists)){
            return 0;
        }
        return lists.size();
    };

    @GetMapping("/app")
    public Object app(){

        LOGGER.info("the yang value is ---> {} " , yang);
        List<String> nameLists = new ArrayList<>();
        nameLists.add("GavinYang");
        nameLists.add("PeterWong");
        Integer listCount = COUNT_LIST.apply(nameLists);

        LOGGER.info(" the listCount value is ---> {} " , listCount);
        return yang;

    }


}
