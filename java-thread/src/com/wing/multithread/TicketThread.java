package com.wing.multithread;

/**
 * @author memory125
 */

// 多个线程同时操作同一个对象： 抢票
// 发现问题：多个线程操作同一个资源的情况下，县城不安全，数据紊乱
public class TicketThread implements Runnable{
    long ticketNumber = 50;

    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();

        // 启动线程
        new Thread(ticketThread, "T1").start();
        new Thread(ticketThread, "T2").start();
        new Thread(ticketThread, "T3").start();
        new Thread(ticketThread, "T4").start();
//        new Thread(ticketThread, "T5").start();
//        new Thread(ticketThread, "T6").start();
    }

    @Override
    public void run() {
        while (true) {
            if (ticketNumber <= 0) {
                break;
            }

            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第" + ticketNumber-- + "票！");
            //ticketNumber--;
        }
    }
}
