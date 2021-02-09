package com.wing.reflection.test;

import com.wing.reflection.modules.UserInfo;
import com.wing.reflection.modules.Teacher;

/**
 * @author memory125
 */
public class ReflectionTest2 {
    public static void main(String[] args) throws ClassNotFoundException {
        UserInfo user = new Teacher();
        System.out.println(user.hashCode());

        // 获取类的方式
        // 1. Class.forName("包名")
        Class c1 = Class.forName("com.wing.reflection.Student");
        // 2. 类名.class
        Class c2 = Teacher.class;
        // 3. 类对象.getClass()
        Class c3 = user.getClass();
        // 4. 基本内置类型的包装类都有一个TYPE属性
        Class c4 = Integer.TYPE;

        // 输出类的哈希码
        System.out.println("============hashCode=============");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

        // 获取类的名称
        System.out.println("============getName=============");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());

        // 获取包名
        System.out.println("============getPackage=============");
        System.out.println(c1.getPackage());
        System.out.println(c2.getPackage());
        System.out.println(c3.getPackage());
        System.out.println(c4.getPackage());

        // 获取父类
        System.out.println("============getSuperclass=============");
        System.out.println(c1.getSuperclass());
        System.out.println(c2.getSuperclass());
        System.out.println(c3.getSuperclass());
        System.out.println(c4.getSuperclass());
    }
}
