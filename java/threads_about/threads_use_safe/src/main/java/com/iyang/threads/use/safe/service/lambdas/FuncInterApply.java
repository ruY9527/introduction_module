package com.iyang.threads.use.safe.service.lambdas;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

/**
 * @author Yang
 * @date 2020/8/17 / 17:22
 */
public class FuncInterApply {

    public static void main(String[] args) {

        Map<String,String> dataStrMap = new HashMap<>();
        dataStrMap.put("123","GavinYang123");
        String result = Optional.ofNullable(dataStrMap)
                .map(map -> map.get("123")).orElse(null);
        System.out.println(result);

    }

    public static void fun(){

        BiFunction<Integer,Integer,Integer> f =  (x,y) -> x + y;
        Function<Integer,Integer> g =  x -> f.apply(1,x);
        System.out.println(g.apply(2));

        Function<Integer,Function<Integer,Integer>> fff =  x ->  y -> x + y;
        System.out.println(fff.apply(1).apply(2));

    }

    public static void expression(){
        Supplier<String> stringSupplier = () -> "OK";
        // 返回的是空字符
        Supplier<String> supplier = String::new;

        // Predicate 接口是输入一个函数,返回布尔类型.
        Predicate<Integer> positiveNumber =  i -> i > 0;
        Predicate<Integer> evenNumber = i -> i % 2 == 0;

        System.out.println(positiveNumber.and(evenNumber).test(2));

        Function<String, String> upperCaseFun = String::toUpperCase;
        Function<String,String> duplicate = s -> s.concat(s);

        Supplier<Integer> random = () -> ThreadLocalRandom.current().nextInt();
        System.out.println(random.get());

        BinaryOperator<Integer> add = Integer::sum;
        BinaryOperator<Integer> subtraction = (a,b) -> a - b;

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

}
