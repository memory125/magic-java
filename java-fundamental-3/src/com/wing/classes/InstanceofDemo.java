package com.wing.classes;

import com.wing.classes.modules.Staff;
import com.wing.classes.modules.Student;
import com.wing.classes.parents.Person;

public class InstanceofDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Person person1 = new Student();
        Object obj1 = new Student();

        System.out.println("=====================Student===========================");
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Object);
//        System.out.println(student instanceof Staff);
        System.out.println(person1 instanceof Person);
        System.out.println(person1 instanceof Student);
        System.out.println(person1 instanceof Staff);    // false
        System.out.println(person1 instanceof Object);
        System.out.println(obj1 instanceof Person);
        System.out.println(obj1 instanceof Student);
        System.out.println(obj1 instanceof Staff);           // false
        System.out.println(obj1 instanceof Object);
        System.out.println(obj1 instanceof String);      //false

        System.out.println("=====================Staff===========================");
        Staff staff = new Staff();
        Person person2 = new Staff();
        Object obj2 = new Staff();
        System.out.println(staff instanceof Person);
       // System.out.println(staff instanceof Student);
        System.out.println(staff instanceof Object);
        System.out.println(person2 instanceof Person);
        System.out.println(person2 instanceof Student);          // false
        System.out.println(person2 instanceof Staff);
        System.out.println(person2 instanceof Object);
        System.out.println(obj2 instanceof Person);
        System.out.println(obj2 instanceof Student);    // false
        System.out.println(obj2 instanceof Staff);
        System.out.println(obj2 instanceof Object);
        System.out.println(obj2 instanceof String);      // false
    }
}
