package com.wing.classes.parents;

/**
 * @author memory125
 */
public class Animals {
    String name;

    static {
        System.out.println("Animals: static代码块");
    }

    public Animals() {
        System.out.println("Animals-构造方法！！！！！！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    String type;
    String gender;

    {
        System.out.println(this.getClass() + ": 匿名代码块！！！！！");
    }


    public void eat() {
        System.out.println("eat");
    }

    /*
    Animals animals = new Animals();
    运行结果:
    Animals: static代码块
    class com.wing.classes.parents.Animals: 匿名代码块！！！！！
    Animals-构造方法！！！！！！！！
     */
}
