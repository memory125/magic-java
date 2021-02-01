package com.wing.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author memory125
 */
// 打印当前事件
public class TimeTest2 {
    public static void main(String[] args)  {
        Date date = new Date(System.currentTimeMillis());
        String currentTime = null;

        while (true) {
            // 将时间格式化输出
            currentTime = new SimpleDateFormat("hh:mm:ss").format(date);
            System.out.println("当前时间是: " + currentTime);
            // 重新获取当前时间
            date = new Date(System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
