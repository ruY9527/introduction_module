package com.iyang.design.modle.create.singleton;

/**
 * @author Yang
 * @date 2020/8/6 / 19:03
 *
 * 饿汉式单例模式
 */

public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * test function
     */
    public void call(){
        System.out.println("调用 HungrySingleton 中 call 方法");
    }

}
