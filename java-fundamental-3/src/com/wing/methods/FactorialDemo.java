package com.wing.methods;
import java.util.Scanner;

public class FactorialDemo {
    // 阶乘函数
    // 1! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // ...
    private static long factorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算阶乘的数据： ");
        long number = scanner.nextLong();

        System.out.println(number + "的阶乘结果是: " + factorial(number));

        scanner.close();
    }
}
