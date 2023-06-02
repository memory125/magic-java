package com.wing.fundamental;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class ArrayTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数组维数: ");
        int n = scanner.nextInt();

        if (n < 0 || n == 1) {
            return;
        }

        int arr[][] = new int[n][n];
        System.out.print("请输入" + n + "维数组各元素：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                arr[i][j] = a;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println("其对角线之和为： "+sum);
    }
}
