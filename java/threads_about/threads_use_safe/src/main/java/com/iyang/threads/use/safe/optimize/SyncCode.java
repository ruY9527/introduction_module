package com.iyang.threads.use.safe.optimize;

/**
 * @author Yang
 * @date 2020/8/17 / 16:03
 */
public class SyncCode {

    /**
     * flags出现的内容:  ACC_PUBLIC, ACC_SYNCHRONIZED
     * 使用 ACC_SYNCHRONIZED  访问标志来区分一个方法是否是同步方法.
     */
    public synchronized void method1(){}

    public void method2(){
        Object o = new Object();
        //         11: monitorenter
        //        12: aload_2
        //        13: monitorexit
        synchronized (o){

        }
    }

}
