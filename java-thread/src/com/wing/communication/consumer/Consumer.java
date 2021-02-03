package com.wing.communication.consumer;

import com.wing.communication.Container;
import com.wing.communication.Product;

/**
 * @author memory125
 */
public class Consumer extends Thread{
    Container container;

    public Consumer(Container container, String name) {
        super(name);
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + "消费了第" + container.pop().id + "个产品！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
