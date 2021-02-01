package com.wing.state;

/**
 * @author memory125
 */
public class TestYield {
    public static void main(String[] args) {
        // 创建线程对象
        YieldThread testYield = new YieldThread();

        // 启动
        new Thread(testYield, "线程1").start();
        new Thread(testYield, "线程2").start();
    }
}
