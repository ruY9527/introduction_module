package com.iyang.threads.use.safe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author baoyang
 *
 */
@SpringBootApplication
public class ThreadsUseSafeApplication {

    /**
     * 并发编程:  跳出来,看全景;钻进去,看本质.
     * 分工/同步/异步.
     * 分工: Executor 与 线程池  /   Fork与Join  /  Future / Guarded Suspension模式  / Balking模式  / Thread-Pre-Message模式
     *       生产者-消费者模式  /  Worker-Thread模式  / 两阶段终止模式
     *
     *  协作:  Semaphore / Monitor(Lock&Condition 与 Synchronized)  / CountDownLatch  / CyclicBarrier /  Phaser  / Exchanger
     *  互斥:  无锁(不变量/线程本地存储/CAS/Copy-On-Write/原子类)  和  互斥锁(Synchronized/Lock/读写锁)
     *
     * 类比方式(理解东西学会与生活中的列子进行类比关系):
     *      生产者  -  消费者 : --->  大厨和服务员.
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ThreadsUseSafeApplication.class, args);
    }

}
