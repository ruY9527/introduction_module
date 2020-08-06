package com.iyang.design.modle.create.singleton;

/**
 * @author Yang
 * @date 2020/8/6 / 19:06
 *
 * 懒汉式单例.  当使用到的时候,才会被初始化.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton ;

    private LazySingleton(){}

    /**
     * 懒汉式,当使用到的时候才会操作.
     * 如果是没有的话,就去new. 如果有的话,就不会new,return 回去.
     * 该写法下,在多线程的情况下,是不安全的。
     * @return
     */
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 使用 synchronized 加锁来进行线程安全操作.
     * @return
     */
    public static synchronized LazySingleton getSafeInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 使用 synchronized + 二个if 进行判断.
     * @return
     */
    public static LazySingleton getDoubleCheckInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
