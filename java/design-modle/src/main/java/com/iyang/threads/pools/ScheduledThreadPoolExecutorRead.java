package com.iyang.threads.pools;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author Yang
 * @date 2020/8/11 / 0:23
 */
public class ScheduledThreadPoolExecutorRead {


    /***
     * 方法阅读:
     *  {@link ScheduledThreadPoolExecutor#scheduleAtFixedRate(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit)}
     *       public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
     *                                                   long initialDelay,
     *                                                   long period,
     *                                                   TimeUnit unit) {
     *         if (command == null || unit == null)
     *             throw new NullPointerException();
     *         if (period <= 0)
     *             throw new IllegalArgumentException();
     *         //    unit.toNanos(period) : 处理时间
     *         ScheduledFutureTask<Void> sft =
     *             new ScheduledFutureTask<Void>(command,
     *                                           null,
     *                                           triggerTime(initialDelay, unit),
     *                                           unit.toNanos(period));
     *         RunnableScheduledFuture<Void> t = decorateTask(command, sft);
     *         sft.outerTask = t;
     *         //  java.util.concurrent.ScheduledThreadPoolExecutor#delayedExecute(java.util.concurrent.RunnableScheduledFuture)
     *
     *         delayedExecute(t);
     *         return t;
     *     }
     *
     *
     *   private void delayedExecute(RunnableScheduledFuture<?> task) {
     *         if (isShutdown())
     *             reject(task);
     *         else {
     *         // 添加任务,子类实现
     *         // add 是通过 delayQueue延迟实现 offer 获取对象的延迟
     *             super.getQueue().add(task);
     *         //    canRunInCurrentRunState(task.isPeriodic()) 判断是否停止了
     *             if (isShutdown() &&
     *                 !canRunInCurrentRunState(task.isPeriodic()) &&
     *                 remove(task))
     *                 task.cancel(false);
     *             else
     *                 ensurePrestart();
     *         }
     *     }
     * @param args
     */
    public static void main(String[] args) {

        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2);


    }

}
