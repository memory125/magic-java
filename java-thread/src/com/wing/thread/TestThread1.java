package com.wing.thread;

/**
 * @author memory125
 */
// 创建线程方式一: 继承Thread类，重写run()方法，条用start()开启线程
// 总结：注意，线程开启不一定要立即执行，由CPU调度执行
public class TestThread1 extends Thread{
    public static void main(String[] args) {
        // 创建一个线程对象
        TestThread1 testThread1 = new TestThread1();

        // 调用start方法开启线程，CPU安排调度
        testThread1.start();

        // main线程
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm coding, this is main thread!!!" + i);
        }
    }

    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm learning Java thread programming!!!" + i);
        }
    }
}
