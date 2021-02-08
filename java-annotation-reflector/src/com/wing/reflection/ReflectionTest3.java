package com.wing.reflection;

import java.lang.annotation.*;

/**
 * @author memory125
 */
public class ReflectionTest3 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 各类型的class对象
        Class c1 = Object.class;      // 类
        Class c2 = Comparable.class;  // 接口
        Class c3 = String[].class;    // 一维数组
        Class c4 = int[][].class;     // 二维数组
        Class c5 = Override.class;    // 注解
        Class c6 = Deprecated.class;  // 注解
        Class c7 = ElementType.class; // 枚举
        Class c8 = Integer.class;     // 基本数据类型
        Class c9 = void.class;        // void
        Class c10 = Class.class;      // Class

        // 输出对象属性
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);

        // 测试数组不同长度的哈希值
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}
