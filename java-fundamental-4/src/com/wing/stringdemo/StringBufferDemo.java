package com.wing.stringdemo;

import java.util.Scanner;

/**
 * @author memory125
 */
public class StringBufferDemo {
    static final String END_FLAG = "00";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // StringBuffer 可变长，多线程数据量较大，效率低，安全
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println("请输入数据：");
        String str = null;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            if (END_FLAG.equals(str)) {
                break;
            }
            stringBuffer.append(str);
        }

        System.out.println(stringBuffer.toString());

        scanner.close();
    }
}
