package com.wing.communication.consumer;

import com.wing.communication.Channel;

/**
 * @author memory125
 */
public class Consumer2 extends Thread{
    Channel channel;

    public Consumer2(Channel channel, String name) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                channel.watch();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
