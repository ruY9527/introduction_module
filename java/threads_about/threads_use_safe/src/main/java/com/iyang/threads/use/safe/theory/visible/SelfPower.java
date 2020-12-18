package com.iyang.threads.use.safe.theory.visible;

/**
 * @author Yang
 * 当前服务 : threads_use_safe
 * @date 2020/11/4 / 10:13
 */
public class SelfPower {

    /**
     *10 : 0
     * 1000: 7
     * 10000: 9
     * 100000: 60
     * 1000000: 425   5
     * 10000000: 4218  6
     *           40370   7
     *           40370000  10*10 用时时间
     *
     * @param args
     */
    public static void main(String[] args) {

        /*double pow1 = Math.pow(10, 10);
        System.out.println(pow1);*/

        long sum = 0;
        // long l = System.currentTimeMillis();
        for(int i=1;i<1000;i++){
            long pow = (long)Math.pow(i, i);
            sum += pow;
        }
        /*long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);*/
        System.out.println(sum);

    }

}
