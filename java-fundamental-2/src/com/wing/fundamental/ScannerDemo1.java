package com.wing.fundamental;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        System.out.println("Scanner hasNext----Please enter the inputs: ");

        // hasNext
        if (scanner.hasNext()) {
            str = scanner.next();
            System.out.println(str);
        }

        scanner.close();
        System.out.println("-------------scanner end-------------------");
    }
}
