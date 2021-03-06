package com.wing.classes;

import com.wing.classes.modules.Student;
/**
 * @author memory125
 */
public class StudentDemo {
    public static void main(String[] args) {
        // student 1
        Student stu1 = new Student();
        stu1.setName("Jack");
        stu1.setAge(11);
        stu1.setGender("Male");
        stu1.setClassLevel(5);
        stu1.setAddr("Shenzhen,Guangdong,China");

        // student 2
        Student stu2 = new Student();
        stu2.setName("Jane");
        stu2.setAge(10);
        stu2.setGender("Female");
        stu2.setClassLevel(4);
        stu2.setAddr("Xian,Shanxi,China");

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
