package com.wing.methods;

import java.util.Scanner;

public class CompareDemo {
    private static long max(long a, long b) {
        return a - b > 0 ? a : b;
    }

    private static long min(long a, long b) {
        return a - b < 0 ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字： ");

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(a + "和" + b + "中" + max(a, b) + "大");
        System.out.println(a + "和" + b + "中" + min(a, b) + "小");
        scanner.close();

        System.out.println("----------- CompareDemo End--------------");
    }
}
