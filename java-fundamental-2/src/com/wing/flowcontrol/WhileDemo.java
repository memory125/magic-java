package com.wing.flowcontrol;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        long sum = 0;
        System.out.println("请输入要计算的数字： ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        // 计算0到number的和
        while (i < number) {
            sum += i;
            i++;
        }

        scanner.close();
        System.out.println(number + "以内的和是： " + sum);
    }
}
