package com.iyang.threads.use.safe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang
 * 当前服务 : threads_use_safe
 * @date 2020/12/3 / 22:44
 */


@RestController
@RequestMapping("/tl")
public class ThreadLocalNoRemoveController {

    private ThreadLocal<String> THREAD_LOCAL_POOL = new ThreadLocal<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadLocalNoRemoveController.class);

    /**
     * 一个线程使用ThreadLocal的话,调用了set方法,一定要最后记得调用remove.
     * 如果不remove的话,你在线程池中,上次使用当前线程的数据会保留(如果是调用add的话,那你的线程会一直往里添加shuju).
     * 如果不是在一个线程池, 内存泄漏的问题 ---> 内存溢出（OOM）.
     *
     * 配置注入到 Spring 中一起使用.
     * @param name
     */
    @GetMapping("/add")
    public void add(String name){

        try {
            if(THREAD_LOCAL_POOL.get() == null){
                LOGGER.info("Enter ThreadLocal set value...");
                THREAD_LOCAL_POOL.set(name);
            } else {
                LOGGER.info("No Enter ThreadLocal set value");
            }
        } finally {
            THREAD_LOCAL_POOL.remove();
        }


    }

}
