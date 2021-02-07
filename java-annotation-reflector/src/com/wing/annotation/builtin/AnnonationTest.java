package com.wing.annotation.builtin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author memory125
 */
// 什么是注释
// @SuppressWarnings("all")
public class AnnonationTest {
    // 内置注解2
    // @Deprecated：废弃的注解，不推荐程序员使用，但可以使用，或者存在更好的方式
    @Deprecated
    public static void test1() {
        System.out.println("test=========>@Deprecated");
    }

    public static void main(String[] args) {
        test1();
    }

    // 内置注解3
    // @SuppressWarnings：主要用在取消一些编译器产生的警告对代码左侧行列的遮挡
    // 适用范围：可以用于类、字段、函数、函数入参、构造函数和函数的局部变量
    public void test2() {
        List list = new ArrayList();
    }

    // 内置注解1
    // @Override: 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }
}
