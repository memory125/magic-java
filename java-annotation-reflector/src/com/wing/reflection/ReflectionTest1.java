package com.wing.reflection;

/**
 * @author memory125
 */
public class ReflectionTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.wing.reflection.UserInfo");

        System.out.println(c1.getName());
        System.out.println(c1.getPackage());
        System.out.println(c1.getClass());
        System.out.println(c1.getDeclaredMethods());
    }
}
