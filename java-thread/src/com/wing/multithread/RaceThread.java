package com.wing.multithread;

/**
 * @author memory125
 */
// 模拟龟兔赛跑
public class RaceThread implements Runnable {
    // 胜利者
    private static String winner;

    public static void main(String[] args) {
        RaceThread raceThread = new RaceThread();

        new Thread(raceThread, "Rabbit").start();
        new Thread(raceThread, "Tortoise").start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            // 模拟兔子休息
            if (Thread.currentThread().getName().equals("Rabbit") && i % 2 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean flag = gameOver(i);
            // 如果比赛结束，停止程序
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "---->跑了" + i + "步！");
        }

    }

    // 判断是否完成比赛
    private boolean gameOver(int steps) {
        if (winner != null) {
            return true;
        }
        if (steps >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("Winner is " + winner);
            return true;
        }
        return false;
    }
}
