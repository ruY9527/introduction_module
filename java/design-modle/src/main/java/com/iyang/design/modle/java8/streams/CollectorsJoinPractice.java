package com.iyang.design.modle.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Yang
 * @date 2020/8/7 / 0:33
 */
public class CollectorsJoinPractice {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三","李四","王五","赵六");

        /*String joiStr = stream.collect(Collectors.joining());
        System.out.println(joiStr);*/

       /* String collect = stream.collect(Collectors.joining("-"));
        System.out.println(collect);*/

        String collect1 = stream.collect(Collectors.joining("-", "(", ")"));
        System.out.println(collect1);

    }

}
