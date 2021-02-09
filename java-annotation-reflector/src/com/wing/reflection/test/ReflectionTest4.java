package com.wing.reflection.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author memory125
 */
public class ReflectionTest4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // 获取类对象
        Class c1 = Class.forName("com.wing.reflection.classmodules.UserInfo");

        // 1. 获取类的类名
        System.out.println("==================1. Class Name=========================");
        System.out.println(c1.getName());            // 包名 + 类名
        System.out.println(c1.getSimpleName());      // 类名

        // 2. 获取类的属性
        System.out.println("==================2. Class Fields=========================");
        Field[] fields = c1.getFields();                  // 获取类中所有public的属性
        for (Field field : fields) {
            System.out.println("getFields: " + field);
        }
        Field[] declaredFields = c1.getDeclaredFields();  // 获取类中声明的所有属性
        for (Field field : declaredFields) {
            System.out.println("getDeclaredFields: " + field);
        }

        // 3. 获取类的方法
        System.out.println("==================3. Class Methods=========================");
        Method[] methods = c1.getMethods();         // 获取类中所有public的方法
        for (Method method : methods) {
            System.out.println("getMethods: " + method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods();  // 获取类中声明的所有方法
        for (Method method : declaredMethods) {
            System.out.println("getDeclaredMethods: " + method);
        }

        // 4. 获取指定参数的方法
        System.out.println("==================4. Class Specified Methods=========================");
        Method setAge = c1.getDeclaredMethod("setAge", int.class);
        System.out.println("getDeclaredMethod" + setAge);
        Method getAge = c1.getDeclaredMethod("getAge", null);
        System.out.println("getDeclaredMethod" + getAge);

        // 5. 获取构造器
        System.out.println("==================5. Class Constructors=========================");
        Constructor[] constructors = c1.getConstructors();             // 获取类中public的构造器
        for (Constructor constructor : constructors) {
            System.out.println("getConstructors" + constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();      // 获取类中所有的构造器
        for (Constructor constructor : declaredConstructors) {
            System.out.println("getDeclaredConstructors" + constructor);
        }

        // 6. 获取指定的构造器
        System.out.println("==================6. Class Constructors=========================");
        Constructor declaredConstructor = c1.getDeclaredConstructor(int.class, String.class, int.class, String.class);
        System.out.println("getDeclaredConstructor" + declaredConstructor);

        // 7. 获取接口
        System.out.println("==================7. Interfaces =========================");
        Class[] interfaces = c1.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("getInterfaces: " + anInterface);
        }

        // 8. 获取注解
        System.out.println("==================8. Annotations =========================");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("getAnnotations: " + annotation);
        }
    }
}
