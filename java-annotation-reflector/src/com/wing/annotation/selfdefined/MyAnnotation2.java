package com.wing.annotation.selfdefined;

import java.lang.annotation.*;

// 定义一个注解
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationTest2 {
    // 注解的参数：参数类型 + 参数名()
    String name() default "";
    int age() default 0;
    int id() default -1;
    String[] parameters() default {"input", "output"};
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationTest3 {
    String value();
}

/**
 * @author memory125
 */

public class MyAnnotation2 {

    @MyAnnotationTest2(name = "Jack", age = 18, id = 3, parameters = {"in", "out"})
    public static void test(){
        System.out.println("This is MyAnnotation2 Test!!!!!!!!!!!!");
    }

    public static void main(String[] args) {
        test();
    }

    @MyAnnotationTest3("Jane")
    public void test2() {}
}
