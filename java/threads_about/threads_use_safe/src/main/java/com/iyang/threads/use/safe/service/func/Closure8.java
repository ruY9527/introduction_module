package com.iyang.threads.use.safe.service.func;

import org.omg.CORBA.StringHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Yang
 * @date 2020/8/26 / 11:24
 */
public class Closure8 {

    Supplier<List<Integer>> makeFun(){
        final List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {


        Function<String,Function<String,Function<String,String>>> tCount =  a ->b -> c -> { return a + b + c; };

        Function<String,Function<String,String>> sum =  a ->b -> a + b;

        Function<String, String> function = sum.apply("Gavin");
        System.out.println(function.apply("Yang"));

        Function<String, String> a = sum.apply("DEV-");
        System.out.println(a.apply("Gavin"));
        System.out.println(a.apply("Peter"));
    }

}
