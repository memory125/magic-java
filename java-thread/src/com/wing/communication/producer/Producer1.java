package com.wing.communication.producer;

import com.wing.communication.Container;
import com.wing.communication.Product;

/**
 * @author memory125
 */
public class Producer1 extends Thread{
    Container container;

    public Producer1(Container container, String name) {
        super(name);
        this.container = container;
    }

    // 生产产品
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                container.push(new Product(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "生产了" + i + "个产品！");
        }
    }
}
