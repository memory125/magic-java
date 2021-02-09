package com.wing.reflection.test;

import com.wing.annotation.selfdefined.MyTable;
import com.wing.annotation.selfdefined.MyTableField;
import com.wing.reflection.modules.UserInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author memory125
 */
public class ReflectionTest6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // 获取类对象
        Class c1 = Class.forName("com.wing.reflection.modules.UserInfo");

        // 通过反射获得类的注解
        /*
            @com.wing.annotation.selfdefined.MyTable(value=db_user)
         */
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        
        // 获取注解的value的值
        MyTable myTable = (MyTable)c1.getAnnotation(MyTable.class);
        String value = myTable.value();
        System.out.println(value);

        // 获取类属性或方法的注解
        Field name = c1.getDeclaredField("name");
        Annotation[] nameAnnotaitons = name.getAnnotations();
        for (Annotation nameAnnotaiton : nameAnnotaitons) {
            System.out.println(nameAnnotaiton);
        }

        // 获取指定属性的注解
        Field gender = c1.getDeclaredField("gender");
        MyTableField myTableAnnotation = gender.getAnnotation(MyTableField.class);
        System.out.println(myTableAnnotation.column());
        System.out.println(myTableAnnotation.type());
        System.out.println(myTableAnnotation.length());
    }
}
