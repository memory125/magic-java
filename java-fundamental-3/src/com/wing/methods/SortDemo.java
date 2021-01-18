package com.wing.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortDemo {
    private static void sortArray(long... size) {

    }

    private static long findMinValue(long[] arr) {
        assert arr.length != 0;

        long temp = arr[0];

        // 找出数组中最大的值
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }

        return temp;
    }

    private static long findMaxValue(long[] arr) {
        assert arr.length != 0;

        long temp = arr[0];

        // 找出数组中最大的值
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }

        return temp;
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

//        long[] arr = {10, 12, 256, 445, 415, 457, 457, 789, 4878, 15, 151, 1245, 5484, 512, 1541, 6987};

        long max = findMaxValue(array);
        System.out.println("数组中最大的值是: " + max);

        long min = findMinValue(array);
        System.out.println("数组中最小的值是: " + min);

        scanner.close();
    }
}
