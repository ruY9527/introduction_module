package com.iyang.learn.lambdas;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * Created by Yang on 2020/9/13 23:31
 */

public class LambdaFirstMain {

    public static void main(String[] args) {

        Runnable rOne = () -> System.out.println("Hello Lambda....");
        new Thread(rOne).start();

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });

        TreeSet<String> tss = new TreeSet<>((o1,o2) -> Integer.compare(o1.length(),o2.length()));

        Consumer<String>  fun =  (argss) -> System.out.println(argss);

        Consumer<String> fun1 =  aa -> {
            if("aa".equals(aa)){
                System.out.println("是与aa相等的");
            } else {
                System.out.println("不相等的");
            }
        };


        BinaryOperator<Long> bo =  (x,y) -> {
            System.out.println("调用方法");
            return x + y;
        };

    }

}
