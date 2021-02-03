package com.wing.lock;

import com.wing.multithread.TicketThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author memory125
 */
// 重入锁
public class ReentrantLockTest implements Runnable{
    // 重入锁
    private final ReentrantLock reentrantLock = new ReentrantLock();
    // 票数
    long ticketNumber = 50;

    public static void main(String[] args) {
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();

        // 启动线程
        new Thread(reentrantLockTest, "T1").start();
        new Thread(reentrantLockTest, "T2").start();
        new Thread(reentrantLockTest, "T3").start();
        new Thread(reentrantLockTest, "T4").start();
    }

    @Override
    public void run() {
        while (true) {
            reentrantLock.lock();
            try {
                if (ticketNumber <= 0) break;

                // 模拟延时
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "抢到了第" + ticketNumber-- + "票！");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 务必记得释放锁
                reentrantLock.unlock();
            }
        }
        return;
    }
}
