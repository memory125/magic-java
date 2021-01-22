package com.wing.exceptions;

/**
 * @author memory125
 */
// 定义自己的异常类
public class MyException extends Exception{
    // 异常信息
    private String info;

    public MyException(String message, String info) {
        super(message);
        this.info = info;
    }

    @Override
    public String toString() {
        return this.getClass() + "{" + "info='" + info + '\'' + '}';
    }
}
