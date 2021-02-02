package com.wing.daemon;

/**
 * @author memory125
 */
public class PersonThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println(this.getClass().getName() + " is active!!!!!");
        }
        System.out.println(" ========================= " + this.getClass().getName() + " is over!!!!!! ===================================");
    }
}
