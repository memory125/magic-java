package com.wing.classes.parents;

/**
 * @author memory125
 */
public class Animals {

    // static代码块只执行一次
    static {
        System.out.println("Animals: static代码块");
    }

    // 名字
    String name;

    public Animals() {
        System.out.println("Animals-构造方法！！！！！！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 类别
    String category;
    // 性别
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    {
        System.out.println(this.getClass() + ": 匿名代码块！！！！！");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
