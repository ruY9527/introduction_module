package com.iyang.objs;

import java.lang.ref.WeakReference;

/**
 * Created by Yang on 2020/9/24 23:50
 */

public class ObjectsMethod {

    public static void main(String[] args) {
        // useGetClassFunc();
        // strHashCodeFunc();
        Car car = new Car(9999,"black");
        WeakReference<Car> carWeakReference = new WeakReference<Car>(car);
        int i = 0;
        while (true){
            if(carWeakReference.get() != null){
                i ++;
                System.out.println("Object is alive for "+i+" loops - "+carWeakReference);
            } else {
                System.out.println("Object has been collected.");
                break;
            }
        }
    }

    /**
     * hashCode 方法.
     * String的HashCode算法.
     */
    public static void strHashCodeFunc(){
        String name = "ga";
        char[] value = name.toCharArray();
        int hash = 0;
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;
            for (int i = 0; i < value.length; i++) {
                System.out.println("the val[i] value is " + (val[i] + 1));
                // 比如ga: g:103 / a:97 ; 所以这里的ga就是 103*31 + 97
                h = 31 * h + val[i];
                System.out.println("the h value " + h);
            }
            hash = h;
        }
        System.out.println(hash);
    }


    /**
     *  getClass 方法是一个final 方法,不许子类重写,是一个native方法.
     *
     */
    public static void useGetClassFunc(){
        System.out.println("str".getClass());
        System.out.println("str".getClass() == String.class);
        Number n = 0;
        Class<? extends Number> nClass = n.getClass();
        System.out.println(nClass);
    }

}

class Car {
    private double price;
    private String color;

    public Car(double price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("This is function to will be destroyed");
    }
}