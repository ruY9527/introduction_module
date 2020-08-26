package com.iyang.threads.use.safe.theory.visible;

/**
 * @author Yang
 * @date 2020/8/20 / 15:45
 * <p>
 * 可见性测试
 *
 * 1: 缓存导致的可见性问题
 * 2: 线程切换带来的原子问题
 * 3: 编译优化带来的有序问题 : 双重检查创建单例对象.
 *                             Problem: 假设线程A执行getInstance方法,当执行完后,恰好切换到线程B,
 *                             如果此时线程B在执行第一个判断时候,发现instance!=null是满足的,所以直接返回.
 *                             但是此时instance还没初始化过的,于是调用就有可能获取空指针问题.
 *                             CPU时间片刻切换后,线程B刚好执行到第一次判读.
 *  总结:  深刻理解 可见性/原子性/有序性 在并发场景下的原理.
 *         Long类型64位,在32位通常需要多条指令组合出来,所以无法保证原子性.
 */
public class VisibleTest {

    /**
     * 这里每次打印的都是  10000 到 20000 之间的随机数.
     * 两线程都是基于CPU缓存里面的count值来计算,所以最终导致count的值都是小于20000.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println(calc());

    }

    private  long count = 0;

    private void add() {
        int index = 0;
        while (index++ < 10000) {
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {

        VisibleTest test = new VisibleTest();
        Thread t1 = new Thread(() -> {
            test.add();
        });
        Thread t2 = new Thread(() -> {
            test.add();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return test.count;

    }


}
