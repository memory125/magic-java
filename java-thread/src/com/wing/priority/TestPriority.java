package com.wing.priority;

/**
 * @author memory125
 */
public class TestPriority {
    public static void main(String[] args) {
        // 输出主线程的优先级
        System.out.println(Thread.currentThread().getName() + " priority is " + Thread.currentThread().getPriority());

        // 创建线程
        ThreadPriority threadPriority = new ThreadPriority();

        Thread t1 = new Thread(threadPriority, "Thread 1");
        Thread t2 = new Thread(threadPriority, "Thread 2");
        Thread t3 = new Thread(threadPriority, "Thread 3");
        Thread t4 = new Thread(threadPriority, "Thread 4");
        Thread t5 = new Thread(threadPriority, "Thread 5");

        t1.start();              // 默认优先级，5

        t2.setPriority(3);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY);        // 10
        t4.start();

        t5.setPriority(Thread.NORM_PRIORITY);       // 5
        t5.start();
    }
}
