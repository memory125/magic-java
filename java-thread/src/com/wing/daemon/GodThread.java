package com.wing.daemon;

/**
 * @author memory125
 */
public class GodThread implements Runnable {
    @Override
    public void run() {
       while (true) {
            System.out.println(this.getClass().getName() + " is active!!!!!");
        }
    }
}
