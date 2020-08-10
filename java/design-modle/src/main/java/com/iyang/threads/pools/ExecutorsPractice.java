package com.iyang.threads.pools;

import java.util.concurrent.*;

/**
 * @author Yang
 * @date 2020/8/7 / 1:02
 */
public class ExecutorsPractice {

    private volatile String name = "GavinYang";

    /***
     *
     *
     *  {@link CompletableFuture.ThreadPerTaskExecutor}  启动一个线程执行.
     *  {@link ExecutorService} 核心执行器服务, 包含服务的生命周期.
     *  {@link ScheduledExecutorService} 调度相关的服务
     *
     *  {@link ThreadPoolExecutor} 普通的线程池实现类
     *  {@link ScheduledThreadPoolExecutor} 调度的核心实现类
     *
     *  {@link Executors}  辅助类
     *
     *  {@link CompletionService} 完成服务
     *  {@link ExecutorCompletionService} 完成服务
     *
     *
     *
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     */

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //  newFixedThreadPool   是固定线程池.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // runnable
        executorService.execute(() -> {
            System.out.println("Start GavinYang Test");
        });

        //  callale接口
        Future<String> future = executorService.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "GT Beautiful";
            }
        });

        String s = future.get();
        System.out.println(s);

    }

}
