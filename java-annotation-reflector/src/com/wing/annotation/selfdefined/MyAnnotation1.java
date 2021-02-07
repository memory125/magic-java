package com.wing.annotation.selfdefined;

import java.lang.annotation.*;

// 定义一个注解
// Target：表示注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// Retention：表示注释在什么地方有效
// runtime > class > source
@Retention(value = RetentionPolicy.RUNTIME)

// Documented：表示是否将注解生成在JAVADoc中
@Documented

// Inherited：子类可以继承父类的注解
@Inherited
@interface MyAnnotationTest {

}

/**
 * @author memory125
 */

@MyAnnotationTest
public class MyAnnotation1 {

    public static void test(){
        System.out.println("This is MyAnnotation Test!!!!!!!!!!!!");
    }

    public static void main(String[] args) {
        test();
    }
}
