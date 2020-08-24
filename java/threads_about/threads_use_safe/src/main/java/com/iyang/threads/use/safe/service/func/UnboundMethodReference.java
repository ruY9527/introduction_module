package com.iyang.threads.use.safe.service.func;

import java.util.function.Function;

/**
 * @author baoYang
 *
 */
class X {
    String f(){
        return "X:fun()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnboundMethodReference {


    public static void main(String[] args) {
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
    }

}
