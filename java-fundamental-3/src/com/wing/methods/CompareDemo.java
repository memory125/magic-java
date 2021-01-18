package com.wing.methods;

import java.util.Scanner;

public class CompareDemo {
    private static long max(long a, long b) {
        if (a == b) {
            return 0;
        } else {
            return a - b > 0 ? a : b;
        }
    }

    private static long min(long a, long b) {
        if (a == b) {
            return 0;
        } else {
            return a - b < 0 ? a : b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字： ");

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long max = max(a, b);
        if (max != 0) {
            System.out.println(a + "和" + b + "中" + max + "大");
        } else {
            System.out.println(a + "和" + b + "相等！");
        }
        long min = min(a, b);
        if (min != 0) {
            System.out.println(a + "和" + b + "中" + min + "小");
        } else {
            System.out.println(a + "和" + b + "相等！");
        }
        scanner.close();

        System.out.println("----------- CompareDemo End--------------");
    }
}
