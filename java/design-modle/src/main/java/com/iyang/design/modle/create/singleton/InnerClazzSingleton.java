package com.iyang.design.modle.create.singleton;

/**
 * @author Yang
 * @date 2020/8/6 / 19:19
 * 使用匿名类
 */
public class InnerClazzSingleton {

    private static class SingleHolder {
        private static final InnerClazzSingleton INNER_CLAZZ_SINGLETON = new InnerClazzSingleton();
    }

    private InnerClazzSingleton(){}

    public static final InnerClazzSingleton getInstance(){
        return SingleHolder.INNER_CLAZZ_SINGLETON;
    }

}
