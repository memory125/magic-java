package com.wing.state;

/**
 * @author memory125
 */
public class YieldThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行！！！");
        // 线程礼让
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程停止执行！！！");
    }
}
