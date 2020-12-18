package com.iyang.threads.use.safe.theory.visible;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Yang
 * 当前服务 : threads_use_safe
 * @date 2020/11/4 / 9:23
 */
public class Two {

    public static void main(String[] args) {

        /*System.out.println(3 * 3 * 3 + 20 * 20 * 20);
        System.out.println(9 * 9 * 9 + 25 * 25 * 25);*/
        int num = 150;
        int start = 1;
        int size = 0;
        Map<Double,String> treeMap = new TreeMap<>();
        for(int i=1;i<num;i++){
            double i3 = Math.pow(i, 3);
            for(int j=i+1;j<num;j++){
                double j3 = Math.pow(j, 3);
                for(int k=1;k<num;k++){
                    double k3 = Math.pow(k, 3);
                    for(int l= k +1;l<num;l++){
                        double l3 = Math.pow(l, 3);
                        if(i3 + j3 == k3 + l3 && i != k && i != j && i != l && k != j){
                            treeMap.put((i3+j3),i+"^3+"+j+"^3="+k+"^3+"+l+"^3="+(i3+j3));
                        }
                        size++;
                    }
                }
            }
        }

        System.out.println(size);
        System.out.println(treeMap.size());
        for(Map.Entry<Double,String> entry : treeMap.entrySet()){
            System.out.println(entry.getValue());
        }

    }

}
