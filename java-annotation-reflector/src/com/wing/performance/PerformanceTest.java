package com.wing.performance;

import com.wing.reflection.UserInfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 测试性能
public class PerformanceTest {

    // 普通调用方式测试
    public static void test01() {
        UserInfo userInfo = new UserInfo();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            userInfo.getId();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("普通调用方式测试10亿次,时间为: " + (endTime - startTime) + "ms");
    }

    // 反射调用方式测试
    public static void test02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c1 = Class.forName("com.wing.reflection.UserInfo");
        UserInfo user = (UserInfo) c1.newInstance();
        long startTime = System.currentTimeMillis();
        Method getId = c1.getDeclaredMethod("getId", null);

        for (int i = 0; i < 1000000000; i++) {
            getId.invoke(user, null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("反射调用方式测试10亿次,时间为: " + (endTime - startTime) + "ms");
    }

    // 反射调用，关闭安全检测后测试
    public static void test03() throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("com.wing.reflection.UserInfo");
        UserInfo user = (UserInfo) c1.newInstance();
        long startTime = System.currentTimeMillis();
        Method getId = c1.getDeclaredMethod("getId", null);
        getId.setAccessible(true);

        for (int i = 0; i < 1000000000; i++) {
            getId.invoke(user, null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("反射调用，关闭安全检测后测试10亿次,时间为: " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
