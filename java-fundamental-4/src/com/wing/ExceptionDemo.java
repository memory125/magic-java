package com.wing;

/**
 * @author memory125
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;

        try {                                     // try监控区域
            System.out.println(a / b);
        } catch (ArithmeticException e) {         // catch 捕获异常
            System.out.println(e.toString());
        } finally {                               // 处理善后工作
            System.out.println("Please check your parameters.");
        }
    }
}
