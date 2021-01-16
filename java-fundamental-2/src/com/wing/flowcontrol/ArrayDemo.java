package com.wing.flowcontrol;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 23, 40,45, 56, 57, 53, 34};

        System.out.println("----------Start----------------");
        for (int a: arr) {    // 增强型for循环
            System.out.println(a);
        }
        System.out.println("---------ArrayDemo End--------------------");
    }
}
