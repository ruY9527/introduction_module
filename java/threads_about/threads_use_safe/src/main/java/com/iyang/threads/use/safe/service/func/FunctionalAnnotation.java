package com.iyang.threads.use.safe.service.func;

/**
 * @author baoYang
 */
public class FunctionalAnnotation {

    public static void main(String[] args) {

        Functional fl =  a -> "Goodbye, " + a;
        System.out.println(fl.goodbye("PeterWong"));
    }

}
