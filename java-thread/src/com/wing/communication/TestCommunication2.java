package com.wing.communication;

import com.wing.communication.consumer.Consumer2;
import com.wing.communication.producer.Producer2;

/**
 * @author memory125
 */
// 测试生产者消费者问题2： 信号灯法，标志位解决
public class TestCommunication2 {
    public static void main(String[] args) {
        Channel channel = new Channel();

        new Producer2(channel, "频道").start();
        new Consumer2(channel, "观众").start();
    }
}
