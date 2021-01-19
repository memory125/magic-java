package com.wing.classes.modules;

public class Student {
    private String name;     // 姓名
    private int age;         // 年龄
    private String gender;   // 性别
    private int classLevel;  // 班级

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int level) {
        this.classLevel = level;
    }

    public String toString() {
        return this.getName() + " , " + Integer.toString(this.getAge()) + " , " + this.getGender() + " , " + Integer.toString(this.getClassLevel());
    }
}
