package com.wing.parent;

/**
 * @author memory125
 */
// abstract 抽象类： 类 extends: 单继承 （接口可以多继承）
public abstract class Action {
    // abstract: 抽象方法，只有方法名字，没有方法的实现！
    public abstract void doAction1();
    public abstract void doAction2();
    public abstract void doAction3();
    public abstract void doAction4();
    public abstract void doAction5();

    /* abstract总结：
       1. 约束: 不能new这个抽象类，只能靠子类实现它
       2. 抽象类可以写普通的方法
       3. 抽象方法必须在抽象类中
       4. 约束：抽象的抽象
       5. 存在的意义: 抽象出来，提高开发效率
     */
}
