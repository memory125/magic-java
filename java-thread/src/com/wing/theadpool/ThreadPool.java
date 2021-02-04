package com.wing.theadpool;

/**
 * @author memory125
 */
public class ThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "===> is running!!!");
    }
}
