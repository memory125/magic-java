package com.wing.methods;

import java.util.Scanner;

public class SumDemo {
    static private long sum(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字： ");

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(a + " + " + b + " = " + sum(a, b));

        scanner.close();

        System.out.println("----------- SumDemo End--------------");
    }
}
