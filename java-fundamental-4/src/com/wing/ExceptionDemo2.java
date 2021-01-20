package com.wing;

/**
 * @author memory125
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;

        try {                                     // try监控区域
            System.out.println(a / b);
        } catch (Error e) {         // catch 捕获异常
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        } finally {                               // 处理善后工作
            System.out.println("Please check your parameters.");
        }
    }
}
