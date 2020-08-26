package com.iyang.threads.use.safe.theory.visible;

/**
 * @author Yang
 * @date 2020/8/20 / 16:34
 *
 * Java内存模型(JMM):
 *      Happens-Before规则: 前面一个操作的结果对后续操作是可见的. 约束了编译器的优化行为,虽然编译器优化了,但是一定要遵守Happens-Before规则.
 *      Volatile规则:  传递性, 这条规则是指如果 A Happens-Before B，且 B Happens-Before C，那么 A Happens-Before C.
 *                     禁用缓存以及编译优化.
 *  synchronized: 是Java语言层面提供的互斥原语.锁,一定有一个锁的对象,至于这个对象要保护的资源以及在哪里加锁/解锁,就属于设计层面的.
 *                加锁的本质实在锁对象头中写入当前线程ID.保护临界资源概念. JVM逃逸分析.
 *
 */
public class JMMBaseTest {

    public static void main(String[] args) {

        Thread.currentThread().setName("GavinYang-Thread");

        getCurrentThreadNameInfo();

    }

    public static void getCurrentThreadNameInfo(){
        System.out.println(Thread.currentThread().getName());
    }


}
