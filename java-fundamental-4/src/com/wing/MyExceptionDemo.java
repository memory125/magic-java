package com.wing;

import com.wing.exceptions.MyException;
import java.util.Scanner;

/**
 * @author memory125
 */
public class MyExceptionDemo {
    public static void main(String[] args) throws MyException {
        String file = "文件不存在!!!";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的文件名：");
        long number = scanner.nextLong();
        if (number == 0) {
            throw new MyException("Exception", file);
        } else {
            System.out.println("请输入的是：" + number);
        }

        scanner.close();
    }
}
