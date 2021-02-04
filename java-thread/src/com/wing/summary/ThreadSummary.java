package com.wing.summary;

import java.util.concurrent.*;
/**
 * @author memory125
 */
// 线程创建和启动的方式总结
public class ThreadSummary {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程对象
        Thread1 thread1 = new Thread1("Thread1");
        Thread2 thread2 = new Thread2();

        // 启动线程
        thread1.start();
        new Thread(thread2, "Thread2").start();

        // Callable线程接口启动
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Thread3());
        new Thread(futureTask, "Thread3").start();

        Integer integer = futureTask.get();
        System.out.println(integer);
    }
}

// 1. 继承Thread类
class Thread1 extends Thread {
    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The 1st way of creating java thread!!!!!!");
    }
}

// 2. 实现Runnable接口
class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("The 2nd way of creating java thread!!!!!!!");
    }
}

// 3. 实现Callable接口
class Thread3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("The 3rd way of creating java thread!!!!!!");
        return 100;
    }
}
