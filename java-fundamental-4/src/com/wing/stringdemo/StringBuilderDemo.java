package com.wing.stringdemo;

import java.util.Scanner;

/**
 * @author memory125
 */
public class StringBuilderDemo {
    static final String END_FLAG = "00";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // StringBuilder 可变长，主要用于单线程
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("请输入数据：");
        String str = null;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            if (END_FLAG.equals(str)) {
                break;
            }
            stringBuilder.append(str);
        }

        System.out.println(stringBuilder.toString());

        scanner.close();
    }
}
