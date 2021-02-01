package com.wing.staticproxy;

/**
 * @author memory125
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        // 首先实例化具体的代理对象
        Employee employee = new Employee("Eric");
        // 代理具体对象，并调用具体方法
        new ContractorVendor(employee).mission("Programmer");
    }
}
