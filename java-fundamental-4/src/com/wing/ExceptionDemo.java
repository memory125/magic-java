package com.wing;

/**
 * @author memory125
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Please check your parameters.");
        }
    }
}
