package com.wing.fundamental;

/**
 * @author memory125
 */
public class KeyWord {
    public static void main(String[] args) {
        short a = 0;
        int b = 0;
        long c = 0L;
        byte d = 0;
        double e = 0.0;
        float f = 0.0f;
        boolean flag = false;
        char g = 'a';

        /*
        The final result is here:
        a is 0	 Type is class java.lang.Short	 Max value is 32767	 Min value is -32768
        b is 0	 Type is class java.lang.Integer	 Max value is 2147483647	 Min value is -2147483648
        c is 0	 Type is class java.lang.Integer	 Max value is 9223372036854775807	 Min value is -9223372036854775808
        d is 0	 Type is class java.lang.Byte	 Max value is 127	 Min value is -128
        e is 0.0	 Type is class java.lang.Double	 Max value is 1.7976931348623157E308	 Min value is 4.9E-324
        f is 0.0	 Type is class java.lang.Float	 Max value is 3.4028235E38	 Min value is 1.4E-45
        flag is false	 Type is class java.lang.Boolean
        g is a	 Type is class java.lang.Character
        */
        System.out.println("a is " + a + "\t Type is "+ getType(a)+ "\t Max value is " + Short.MAX_VALUE + "\t Min value is " + Short.MIN_VALUE);
        System.out.println("b is " + b + "\t Type is "+ getType(b)+ "\t Max value is " + Integer.MAX_VALUE + "\t Min value is " + Integer.MIN_VALUE);
        System.out.println("c is " + c + "\t Type is "+ getType(b)+ "\t Max value is " + Long.MAX_VALUE + "\t Min value is " + Long.MIN_VALUE);
        System.out.println("d is " + d + "\t Type is "+ getType(d)+ "\t Max value is " + Byte.MAX_VALUE + "\t Min value is " + Byte.MIN_VALUE);
        System.out.println("e is " + e + "\t Type is "+ getType(e)+ "\t Max value is " + Double.MAX_VALUE + "\t Min value is " + Double.MIN_VALUE);
        System.out.println("f is " + f + "\t Type is "+ getType(f)+ "\t Max value is " + Float.MAX_VALUE + "\t Min value is " + Float.MIN_VALUE);
        System.out.println("flag is " + flag + "\t Type is "+ getType(flag));
        System.out.println("g is " + g + "\t Type is "+ getType(g));

    }

    private static String getType(Object a) {
        return a.getClass().toString();
    }
}
