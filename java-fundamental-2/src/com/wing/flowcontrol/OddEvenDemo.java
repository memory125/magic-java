package com.wing.flowcontrol;

import java.util.Scanner;
/**
 * @author memory125
 */
public class OddEvenDemo {
    public static void main(String[] args) {
        int i = 0;
        long oddSum = 0;    // 奇数和
        long evenSum = 0;   // 偶数和
        System.out.println("请输入要计算的数字： ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        while (i <= number) {
            if (i % 2 == 0) {    // 偶数
                evenSum += i;
            } else {             // 奇数
                oddSum += i;
            }
            i++;
        }

        scanner.close();
        System.out.println(number + "以内的奇数和是： " + oddSum);
        System.out.println(number + "以内的偶数和是： " + evenSum);
    }
}
