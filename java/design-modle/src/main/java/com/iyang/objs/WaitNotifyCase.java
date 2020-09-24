package com.iyang.objs;

/**
 * Created by Yang on 2020/9/25 0:25
 */

public class WaitNotifyCase {

    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();
        new Thread(new Produce(factory, 5)).start();
        new Thread(new Produce(factory, 5)).start();
        new Thread(new Produce(factory, 20)).start();
        new Thread(new Produce(factory, 30)).start();
        new Thread(new Conumser(factory, 10)).start();
        new Thread(new Conumser(factory, 20)).start();
        new Thread(new Conumser(factory, 5)).start();
        new Thread(new Conumser(factory, 5)).start();
        new Thread(new Conumser(factory, 20)).start();

    }

}

class Factory {

    int currentCount = 0;

    public static final Integer MAX_NUM = 50;

    public void subtractNum(int number) throws InterruptedException {
        synchronized (this){
            if(currentCount < number){
                this.wait();
            }
            currentCount -= number;
            System.out.println("consume " + number + ", left: " + currentCount);
            this.notifyAll();
        }
    }

    public void add(int number) throws InterruptedException{
        synchronized (this) {
            while (currentCount + number > MAX_NUM) {
                this.wait();
            }
            currentCount += number;
            System.out.println("produce " + number + ", left: " + currentCount);
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
    public void run()  {
        try {
            factory.add(number);
        } catch (Exception e){
            e.printStackTrace();
        }
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
    public void run()  {
        try {
            factory.subtractNum(number);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}