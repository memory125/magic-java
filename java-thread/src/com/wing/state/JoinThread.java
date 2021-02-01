package com.wing.state;

/**
 * @author memory125
 */
public class JoinThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行！！！" + i);
        }
    }
}
