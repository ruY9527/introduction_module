package com.iyang.objs;

/**
 * Created by Yang on 2020/9/25 0:25
 */

public class WaitNotifyCase {

    public static void main(String[] args) {

        Factory factory = new Factory();
        new Thread(new Producer(factory, 5)).start();
        new Thread(new Producer(factory, 5)).start();
        new Thread(new Producer(factory, 20)).start();
        new Thread(new Producer(factory, 30)).start();
        new Thread(new Consumer(factory, 10)).start();
        new Thread(new Consumer(factory, 20)).start();
        new Thread(new Consumer(factory, 5)).start();
        new Thread(new Consumer(factory, 5)).start();
        new Thread(new Consumer(factory, 20)).start();

    }

}

class Factory {

    int currentCount = 0;

    public static final Integer MAX_NUM = 50;

    public void subtractNum(int number){
        synchronized (this){
            if(currentCount < number){
                this.wait();
            }
            currentCount -= number;
            System.out.println("consume " + num + ", left: " + currentNum);
            this.notifyAll();
        }
    }

    public void add(int number){
        synchronized (this) {
            while (currentCount + number > MAX_NUM) {
                this.wait();
            }
            currentCount += number;
            System.out.println("produce " + num + ", left: " + currentNum);
            this.notifyAll();
        }
    }
}

class Produce implements Runnable{

    private Factory factory;
    private int number;

    public Produce(Factory factory, int number) {
        this.factory = factory;
        this.number = number;
    }

    @Override
    public void run() {
        factory.add(number);
        this.notify();
    }
}

class Conumser implements Runnable {

    private Factory factory;
    private int number;

    public Conumser(Factory factory, int number) {
        this.factory = factory;
        this.number = number;
    }

    @Override
    public void run() {
        factory.subtractNum(number);
    }
}