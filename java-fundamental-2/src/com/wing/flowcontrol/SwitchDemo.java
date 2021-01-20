package com.wing.flowcontrol;
/**
 * @author memory125
 */
public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'S':
                System.out.println("Awesome");
                break;
            case 'A':
                System.out.println("Great");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Soso");
                break;
            case 'E':
                System.out.println("Hmm,bad!");
                break;
            default:
                System.out.println("No grade found!");
                break;
        }
    }
}
