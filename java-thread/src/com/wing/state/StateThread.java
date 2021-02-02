package com.wing.state;

/**
 * @author memory125
 */
public class StateThread {
    public static void main(String[] args) {
        // 使用lamdba表达式创建线程
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " is running!!!!!!!");
            }
        }, "线程A");

        // 获取线程状态
        Thread.State state = thread.getState();
        System.out.println(Thread.currentThread().getName() + " is " +  state);   // New

        // 启动线程
        thread.start();
        state = thread.getState();
        System.out.println(Thread.currentThread().getName() + " is " +  state);       // Runnable

        while (state != Thread.State.TERMINATED) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();
            System.out.println(Thread.currentThread().getName() + " is " +  state);        // Waitting
        }
    }
}
