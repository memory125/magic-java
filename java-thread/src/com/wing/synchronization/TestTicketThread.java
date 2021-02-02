package com.wing.synchronization;

/**
 * @author memory125
 */
public class TestTicketThread {
    public static void main(String[] args) {
        TicketThreadPlus ticketThread = new TicketThreadPlus();

        // 启动线程
        new Thread(ticketThread, "T1").start();
        new Thread(ticketThread, "T2").start();
        new Thread(ticketThread, "T3").start();
        new Thread(ticketThread, "T4").start();
//        new Thread(ticketThread, "T5").start();
//        new Thread(ticketThread, "T6").start();
    }
}
