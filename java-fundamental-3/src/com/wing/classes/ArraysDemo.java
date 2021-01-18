package com.wing.classes;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArraysDemo {
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

        System.out.println("您输入的数组是: ");

        // 将List<Long>转成long[]
        long [] array = longArr.stream().mapToLong(t->t.longValue()).toArray();
        // 打印数组,使用Arrays类实现
        System.out.println(Arrays.toString(array));

        // 反转数组
        long[] reversedArray = reverseArray(array);
        System.out.println("反转后的数组是: ");
        System.out.println(Arrays.toString(reversedArray));

        scanner.close();
    }
}
