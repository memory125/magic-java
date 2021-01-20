package com.wing.fundamental;

import java.util.Scanner;
/**
 * @author memory125
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
        // hasNextLine
        Scanner scanner = new Scanner(System.in);
        String str = null;
        System.out.println("Scanner hasNextLine-----Please enter the inputs: ");

        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println(str);
        }

        scanner.close();

        System.out.println("-------------scanner end-------------------");
    }
}
