package com.wing.fundamental;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        // hasNextLine
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;

        System.out.println("Scanner hasNextInt & hasNextFloat-----Please enter the inputs: ");

        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Please enter Integer data");
        }

        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println(f);
        } else {
            System.out.println("Please enter Float data");
        }

        scanner.close();

        System.out.println("-------------Scanner hasNextInt & hasNextFloat end-------------------");
    }
}
