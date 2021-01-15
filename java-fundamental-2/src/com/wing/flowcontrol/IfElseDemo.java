package com.wing.flowcontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入数据: ");
        String num = scanner.nextLine();
        long chCount = queryCharCountAtString(num, '.');

        System.out.println(chCount);

        if (isNumeric(num)) {
            if (chCount == 0) {
                if (Long.valueOf(num.toString()) instanceof Long) {
                    System.out.println(num + "是整数！");
                }
            } else {
                // 其他类型
                System.out.println(num + "是其他类型");
            }
        } else {
            if (chCount == 1) {
                // 判断是否是浮点数
                if (Float.valueOf(num.toString()) instanceof Float) {
                    System.out.println(num + "是浮点数！");
                }
            } else if (chCount > 1) {
                System.out.println(num + "是其他类型！");
            } else {
                System.out.println(num + "是字符串！");
            }
        }
    }

    // 统计特殊字符的个数
    private static long queryCharCountAtString(String str, char ch) {
        long count = 0;
        assert !str.isEmpty();
        int i = 0;
        char temp = '\0';
        long length = str.length();
        for (i = 0; i < length; i++) {
            temp = str.charAt(i);
            if (temp == ch) {
                count++;
            }
        }

        return count;
    }

    // 判断是否为数字
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
}