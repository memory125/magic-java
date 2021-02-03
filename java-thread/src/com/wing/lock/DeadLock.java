package com.wing.lock;

/**
 * @author memory125
 */
// 死锁：多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        // 创建线程
        SteakFood jack = new SteakFood(0, "Jack");
        SteakFood david = new SteakFood(1, "David");

        // 启动线程
        jack.start();
        david.start();

        // 运行结果
        /*
            David获得刀子！！！！
            Jack获得叉子！！！！
            ....
         */
    }
}
