package com.wing.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author memory125
 */
public class ReflectionTest5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        // 获取类对象
        Class c1 = Class.forName("com.wing.reflection.UserInfo");

        // 构造对象
        UserInfo user = (UserInfo) c1.newInstance();         // 本质就是调用类的无参构造器
        System.out.println(user);

        // 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(int.class, String.class, int.class, String.class);
        UserInfo user1 = (UserInfo) constructor.newInstance(1, "Jack", 23, "Female");
        System.out.println(user1);

        // 通过反射调用方法
        UserInfo user2 = (UserInfo) c1.newInstance();
        Method setAge = c1.getDeclaredMethod("setAge", int.class);
        // invoke: 激活，调用方法:(对象, 对象的值)
        setAge.invoke(user2, 18);
        System.out.println(user2);

        // 通过反射调用属性
        // 不能直接访问private属性，要关闭程序的安全检测，使用方式: 类对象，方法，属性调用setAccessible(true)
        UserInfo user3 = (UserInfo) c1.newInstance();
        Field age = c1.getDeclaredField("age");
        age.setAccessible(true);
        age.set(user3, 36);
        System.out.println(user3);
    }
}
