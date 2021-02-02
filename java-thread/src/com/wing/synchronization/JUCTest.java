package com.wing.synchronization;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author memory125
 */
public class JUCTest {
    public static void main(String[] args) {
        // 创建线程安全的ArrayList对象
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

        // 通过线程添加数据
        for (int i = 0; i < 10000; i++) {
           new Thread(() -> {
             copyOnWriteArrayList.add(Thread.currentThread().getName());
           }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(copyOnWriteArrayList.size());              // 10000
    }
}
