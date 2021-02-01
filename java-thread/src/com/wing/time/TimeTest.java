package com.wing.time;

/**
 * @author memory125
 */
// 模拟倒计时
public class TimeTest {
    public static void main(String[] args) throws InterruptedException {
        tenDown();
    }

    public static void tenDown() throws InterruptedException {
        int ms = 10;

        while (true) {
            Thread.sleep(1000);
            System.out.println("还有" + ms-- + "秒！");

            if (ms <= 0) {
                break;
            }
        }
    }
}
