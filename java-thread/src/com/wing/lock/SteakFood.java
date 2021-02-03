package com.wing.lock;

/**
 * @author memory125
 */
// 牛排
public class SteakFood extends Thread{
    // 模拟：只有一份刀叉，用static来保证只有一份
    static Fork fork = new Fork();
    static Knife knife = new Knife();
    // 表示选项
    int choice;
    // 用餐的人
    String person;

    public SteakFood(int choice, String person) {
        this.choice = choice;
        this.person = person;
    }

    @Override
    public void run() {
        try {
            eatSteak();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eatSteak() throws InterruptedException {
        if (choice == 0) {
            // 这里会出现死锁现象，解决方案是各自同步获得的锁
            /*
            synchronized (fork) {   // 获得叉子的锁
                System.out.println(this.person + "获得叉子！！！！");
                Thread.sleep(1000);
            }
            synchronized (knife) {  // 获得刀子的锁
                System.out.println(this.person + "获得刀子！！！！");
             }
             */
            synchronized (fork) {   // 获得叉子的锁
                System.out.println(this.person + "获得叉子！！！！");
                Thread.sleep(1000);
                synchronized (knife) {  // 获得刀子的锁
                    System.out.println(this.person + "获得刀子！！！！");
                }
            }
        } else {
            synchronized (knife) {   // 获得刀子的锁
                System.out.println(this.person + "获得刀子！！！！");
                Thread.sleep(1000);
                synchronized (fork) {  // 获得叉子的锁
                    System.out.println(this.person + "获得叉子！！！！");
                }
            }
        }
    }
}
