package com.iyang.threads.pools;

/**
 * @author Yang
 * @date 2020/8/7 / 20:53
 *
 *  多线程的理解和基本练习Coding
 */
public class ThreadPractice {

    /**
     *  线程是进程的一个实体,是CPU调度和分派的基本单位,它是比进程更小的能独立运行的基本单位.
     *  线程基本上不拥有系统资源.
     *  多线程是指在单个程序中可以同时运行多个不同的线程执行不同的任务.
     *
     *  Runnable / Thread / Callable
     *
     *  线程的状态.
     *  New : 初始状态,线程被创建,但是还没有调用start方法.
     *  Runnable: 运行状态,JAVA线程将操作系统中的就绪状态和运行两种状态笼统的称为 "运行中"
     *  Blocked: 阻塞状态,表示线程阻塞于锁.
     *  Waiting: 等待状态,表示线程进入等待状态,进入该状态表示当前线程需要等待其他线程做出一些特定动作(通知或者中断).
     *  TIME_WAITING  超时等待状态,该状态不同于waiting,它是可以在指定的时间自行返回的
     *  TERMINATED: 终止状态,表示当前线程已经执行完毕了
     */

    public static void main(String[] args) {



    }





}
