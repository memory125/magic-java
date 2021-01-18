package com.wing.methods;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String fileName = "D:" + File.separator + "hello.txt";
        File f = new File(fileName);
        if(f.exists()) {
            String name = f.getName();
            String absolutePath = f.getAbsolutePath();
            System.out.println("文件名是：" + name + "\t 文件的绝对路径是： " + absolutePath);
//            f.delete();
        } else {
            System.out.println("Sorry! 文件不存在!");
        }
    }
}
