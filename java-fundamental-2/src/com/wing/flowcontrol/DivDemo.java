package com.wing.flowcontrol;

import java.util.Scanner;
/**
 * @author memory125
 */
public class DivDemo {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("请输入要计算的数字： ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        while (i <= number) {
            if (i % 5 == 0) {    // 如果可以被5整除
                System.out.print(i + "\t\t");
            }

            // 每行输出3个数字
            if (i % (5 * 3) == 0) {
                System.out.println();
            }
            i++;
        }

        scanner.close();
        System.out.println("------------DivDemo End---------------");
    }
}
