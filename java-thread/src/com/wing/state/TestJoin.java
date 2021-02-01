package com.wing.state;

/**
 * @author memory125
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程对象
        JoinThread testJoin = new JoinThread();
        Thread thread = new Thread(testJoin, "线程Join");

        // 启动
        //new Thread(testJoin, "线程Join").start();
        thread.start();

        // main线程
        for (int i = 0; i < 200; i++) {
            if (i == 100) {
                // Join线程插队
                thread.join();
            }
            System.out.println("main线程在执行！！！" + i);
        }
    }
}
