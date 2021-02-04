package com.wing.communication;

import com.wing.communication.consumer.Consumer1;
import com.wing.communication.producer.Producer1;

/**
 * @author memory125
 */
public class TestCommunication1 {
    public static void main(String[] args) {
        Container container = new Container();

        new Producer1(container, "生产者").start();
        new Consumer1(container, "消费者").start();
    }
}
