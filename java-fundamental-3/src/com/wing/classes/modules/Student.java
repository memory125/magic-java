package com.wing.classes.modules;

import com.wing.classes.parents.Person;

public class Student extends Person {
    private int classLevel;  // 班级

    public Student() {
        super();
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int level) {
        this.classLevel = level;
    }

    @Override
    public String toString() {
        return this.getName() + " , "
                + Integer.toString(this.getAge()) + " , "
                + this.getGender() + " , "
                + Integer.toString(this.getClassLevel()) + " , "
                + this.getAddr();
    }
}
