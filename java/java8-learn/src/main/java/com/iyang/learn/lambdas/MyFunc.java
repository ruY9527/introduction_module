package com.iyang.learn.lambdas;

/**
 * Created by Yang on 2020/9/13 23:41
 */

@FunctionalInterface
public interface MyFunc<T> {

    public T getValue(T t);

}
