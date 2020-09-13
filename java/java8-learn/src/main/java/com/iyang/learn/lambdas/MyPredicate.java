package com.iyang.learn.lambdas;

/**
 * Created by Yang on 2020/9/14 0:20
 */


@FunctionalInterface
public interface MyPredicate<T> {

    public boolean test(T t);

}
