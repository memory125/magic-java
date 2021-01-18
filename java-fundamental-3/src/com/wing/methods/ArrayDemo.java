package com.wing.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
    // 打印数组
    private static void printArray(long[] array) {
        for (long arr: array) {
            System.out.print(arr + "  ");
        }
        System.out.println();
    }

    // 反转数组
    private static long[] reverseArray(long[] array) {
        assert array.length != 0;

        long[] result = new long[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要比较的数据： ");

        List<Long> longArr = new ArrayList<>();

        long input = 0;
        while (scanner.hasNextLong()) {
            input = scanner.nextLong();
            longArr.add(input);
        }

        // 将List<Long>转成long[]
        long [] array = longArr.stream().mapToLong(t->t.longValue()).toArray();

        System.out.println("您输入的数组是: ");
        // 打印数组
        printArray(array);

        // 反转数组
        long[] reversedArray = reverseArray(array);
        System.out.println("反转后的数组是: ");
        printArray(reversedArray);

        scanner.close();
    }
}
