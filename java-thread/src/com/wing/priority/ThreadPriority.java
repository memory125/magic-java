package com.wing.priority;

/**
 * @author memory125
 */
public class ThreadPriority implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running！--------> The priority is " + Thread.currentThread().getPriority());
    }
}
