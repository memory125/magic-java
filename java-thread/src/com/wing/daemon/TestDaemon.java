package com.wing.daemon;

/**
 * @author memory125
 */
public class TestDaemon {
    public static void main(String[] args) {
        GodThread godThread = new GodThread();
        PersonThread personThread = new PersonThread();

        Thread thread = new Thread(godThread, "God");
        thread.setDaemon(true);   // 守护线程，默认是false
        thread.start();

        new Thread(personThread, "Person").start();
    }
}
