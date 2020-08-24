package com.iyang.threads.use.safe.service.lambdas;

/**
 *
 * @author baoYang
 */

class Go {
    static void go(){
        System.out.println("Go::go()");
    }
}

public class GoRunnableFunc {

    public static void main(String[] args) {

        /**
         * start thread function.
         */
        new Thread(Go::go).start();

    }

}
