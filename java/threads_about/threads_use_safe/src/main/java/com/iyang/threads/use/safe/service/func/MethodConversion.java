package com.iyang.threads.use.safe.service.func;

import java.util.function.BiConsumer;

/**
 * @author baoYang
 */

class In1 {}

class In2 {}

public class MethodConversion {

    static void accpet(In1 i1,In2 i2){
        System.out.println("accpect()");
    }

    static void someOtherName(In1 i1,In2 i2){
        System.out.println("someOtherName");
    }

    public static void main(String[] args) {

        BiConsumer<In1,In2> bic;
        bic = MethodConversion::accpet;
        bic.accept(new In1(),new In2());

        bic = MethodConversion::someOtherName;
        bic.accept(new In1(),new In2());
        
    }

}
