package com.wing.communication;

import com.wing.communication.consumer.Consumer;
import com.wing.communication.producer.Producer;

/**
 * @author memory125
 */
public class TestCommunication {
    public static void main(String[] args) {
        Container container = new Container();

        new Producer(container, "生产者").start();
        new Consumer(container, "消费者").start();
    }
}
