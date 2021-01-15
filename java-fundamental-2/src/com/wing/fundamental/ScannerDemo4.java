package com.wing.fundamental;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double x = 0;
        int count = 0;

        System.out.println("请输入数据： ");

        while (scanner.hasNextDouble()) {
            x = scanner.nextDouble();
            count++;
            sum = sum + x;
        }

        scanner.close();

        System.out.println(count + "个数的和为：" + sum);
        System.out.println(count + "个数的平均值为：" + sum/count);
    }
}
