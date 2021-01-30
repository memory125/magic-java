package com.wing.runnable;

/**
 * @author memory125
 */
// 创建线程方式2：实现Runnable接口，重写run方法，执行线程需要丢入Runnable接口的实现类，调用start方法  -----> 推荐使用这种方式
public class TestThread3 implements Runnable {
    public static void main(String[] args) {
        // 1. 创建runnable接口的实现类对象
        //TestThread3 testThread3 = new TestThread3();

        // 2. 创建线程对象，通过线程对象来开启线程，代理
        //Thread thread = new Thread(testThread3);

        // 3. 开启线程
        //thread.start();

        // 启动线程
        new Thread(new TestThread3()).start();

        // main线程
        for (int i = 0; i < 200; i++) {
            System.out.println("I'm coding, this is main thread!!!" + i);
        }
    }

    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("I'm learning Java-thread Runnable programming!!!" + i);
        }
    }
}
