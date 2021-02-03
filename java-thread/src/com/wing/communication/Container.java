package com.wing.communication;

/**
 * @author memory125
 */
// 生产者消费者模型 ----> 利用缓冲区解决：管程法
/*
    对象如下:
    - 生产者
    - 消费者
    - 产品
    - 缓冲区
 */
public class Container {
    // 缓冲区
    Product[] products = new Product[20];

    // 计数器，记录缓冲区数据大小
    int count = 0;

    // 生产者放入产品
    public synchronized void push(Product product) throws InterruptedException {
        // 如果缓冲区已满，则通知消费者消费,生产者等待
        if (count == products.length) {
            wait();
        }

        // 生产过程: 如果缓冲区未满，则将产品加入缓冲区
        products[count] = product;
        count++;

        // 通知消费者消费
        notifyAll();
    }

    // 消费者消费产品
    public synchronized Product pop() throws InterruptedException {
        Product product = null;
        // 如果缓冲区为空，则等待，生产者生产产品
        if (count == 0) {
            wait();
        }

        // 消费过程
        count--;
        product = products[count];

        // 通知生产者生产
        notifyAll();

        return product;
    }
}
