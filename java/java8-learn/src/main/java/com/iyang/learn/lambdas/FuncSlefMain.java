package com.iyang.learn.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * Created by Yang on 2020/9/13 23:42
 */

public class FuncSlefMain {

    /**
     * 内置四大核心函数接口
     *  Consumer<T> 消费型接口
     *  Supplier<T> 供给型接口
     *  Function<T,R> 函数型接口
     *  Predicate<T> 断定型接口
     *
     *  BiFunction<T,U,R>
     *  UnaryOperator<T>  Function子接口
     *  BinaryOperator<T> BiFunction子接口
     *  BiConsumer<T,U>
     *
     * @param args
     */
    public static void main(String[] args) {

        FuncSlefMain fsm = new FuncSlefMain();
        String newStr = fsm.toUpperString((str) -> str.toUpperCase(), "abcdfefh");
        System.out.println(newStr);

        BinaryOperator<Double> bo = (x,y) -> Math.pow(x,y);
        BinaryOperator<Double> boo =  Math::pow;

        Function<Integer,Integer[]> fun = (n) -> new Integer[n];
        Function<Integer,Integer[]> funn = Integer[]::new;

    }

    public String toUpperString(MyFunc<String> myStr,String str){
        return myStr.getValue(str);
    }



}
