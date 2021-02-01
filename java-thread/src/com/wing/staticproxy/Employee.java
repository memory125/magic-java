package com.wing.staticproxy;

/**
 * @author memory125
 */
// 具体的雇佣者，供职于公司的有具体工作的职员
public class Employee implements ContractorEmployee {
    // 雇佣者姓名
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void mission(String mission) {
        System.out.println("employee is " + this.name + "," + "mission is " + mission);
    }
}
