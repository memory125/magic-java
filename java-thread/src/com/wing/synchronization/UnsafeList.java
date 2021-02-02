package com.wing.synchronization;

import java.util.List;
import java.util.ArrayList;

/**
 * @author memory125
 */
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 通过线程添加数据
        for (int i = 0; i < 10000; i++) {
           new Thread(() -> {
               synchronized (list) {         // 解决ArrayList不安全的方法: synchronized (Obj) ----> 同步代码块
                   list.add(Thread.currentThread().getName());
               }
           }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());              // 10000, 9999, 9992
    }
}
