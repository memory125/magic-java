package com.wing.synchronization;

/**
 * @author memory125
 */

// 多个线程同时操作同一个对象： 抢票
// 发现问题：多个线程操作同一个资源的情况下，县城不安全，数据紊乱
public class TicketThreadPlus implements Runnable{
    // 总票数
    long ticketNumber = 50;

    // 票状态，是否售完
    boolean flag = false;

    @Override
    public void run() {
        while (!flag) {
            buyTicket();
        }
    }

    // synchronized: 同步
    public synchronized void buyTicket() {
        if (ticketNumber <= 0) {
            flag = true;
            return;
        }

        // 模拟延时
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "抢到了第" + ticketNumber-- + "票！");
        //ticketNumber--;
    }
}
