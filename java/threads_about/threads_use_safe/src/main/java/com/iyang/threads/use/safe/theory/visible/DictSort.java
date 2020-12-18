package com.iyang.threads.use.safe.theory.visible;

import java.util.Arrays;
import java.util.Vector;

/**
 * @author Yang
 * 当前服务 : threads_use_safe
 * @date 2020/11/4 / 9:50
 */
public class DictSort {

    // [2, 7, 8, 3, 9, 1, 5, 6, 0, 4]
    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();
        Vector<Integer> numberList = new Vector<>();
        int sum = 0;
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for(int i=9;i>=0;i--){
            for(int n=1;n<11;n++){
                if(sum + n * product(i) > 1000000){
                    numberList.add(list.get(n-1));
                    list.remove(n-1);
                    sum += (n-1) * product(i);
                    break;
                }
            }
        }
        /*String s = Arrays.toString(numberList.toArray());
        System.out.println(s);*/
        StringBuffer sb = new StringBuffer();
        numberList.stream().forEach(s -> sb.append(s));
        System.out.println(sb.toString());
        //System.out.println(Arrays.toString(numberList));
    }

    private static int product(int n){
        int sum = 1;
        for(int i=1;i<=n;i++){
            sum *= i;
        }
        return sum;
    }

}
