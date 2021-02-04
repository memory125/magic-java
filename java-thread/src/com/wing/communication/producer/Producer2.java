package com.wing.communication.producer;

import com.wing.communication.Channel;
import com.wing.communication.Container;
import com.wing.communication.Product;

/**
 * @author memory125
 */
public class Producer2 extends Thread{
    Channel channel;

    public Producer2(Channel channel, String name) {
        super(name);
        this.channel = channel;
    }

    // 生产产品
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    channel.play("电影");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    channel.play("广告时间！！！一会回来！！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
