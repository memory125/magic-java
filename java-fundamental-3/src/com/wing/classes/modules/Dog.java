package com.wing.classes.modules;

import com.wing.classes.parents.Animals;

public class Dog extends Animals {
    static {
        System.out.println("Dog: 静态代码块！！！！");
    }

    {
        System.out.println(this.getClass() + ": 匿名代码块！！！！");
    }

    public Dog() {
        super();
        System.out.println("Dog-构造方法！！！！！！！！");
    }

    /*
      Dog dog = new Dog();
      运行结果：
      Animals: static代码块
      Dog: 静态代码块！！！！
      class com.wing.classes.modules.Dog: 匿名代码块！！！！！
      Animals-构造方法！！！！！！！！
      class com.wing.classes.modules.Dog: 匿名代码块！！！！
      Dog-构造方法！！！！！！！！
     */
}
