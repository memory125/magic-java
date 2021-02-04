package com.wing.communication;

/**
 * @author memory125
 */
// 产品->频道
public class Channel {
    // 频道名
    public String channelName;

    // 标志位,节目状态
    boolean flag = false;

    // 生产者播放
    public synchronized void play(String channelName) throws InterruptedException {
        if (!flag) {   // 如果有节目，则等待
            wait();
        }

        System.out.println(Thread.currentThread().getName() + "====>正在播放：" + channelName);
        // 播放节目，并通知消费者观看
        this.channelName = channelName;
        flag = !flag;
        notifyAll();

    }

    // 消费者观看
    public synchronized void watch() throws InterruptedException {
        if (flag) {  // 如果没有节目， 则等待
            wait();
        }

        // 观看节目，通知生产者播放
        System.out.println(Thread.currentThread().getName() + "====>正在观看：" + channelName);
        flag = !flag;
        notifyAll();
    }
}
