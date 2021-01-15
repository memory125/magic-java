import java.util.ArrayList;
import java.util.List;

/**
 * @author memory125
 */
public class Operator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        int a = 10;
        int b = 20;

        // +,-,*,/
        System.out.println(a + b);   // 30
        System.out.println(a - b);   // -10
        System.out.println(a * b);   // 200
        System.out.println(a /(double)b);  // 0.5
        System.out.println(a % b);  // 10

        // boolean
        System.out.println(a > b);      // false
        System.out.println(a < b);      // true
        System.out.println(a == b);     // false
        System.out.println(a != b);     // true

        // ++,--
        int c = 3;
        int d = ++c;
        int e = c++;
        System.out.println(c);      // 5
        System.out.println(d);      // 4
        System.out.println(e);      // 4

        // Math
        double pow = Math.pow(2, 4);   //16.0
        System.out.println(pow);

        // logic operators
        boolean x = false;
        boolean y = true;
        System.out.println(x && y);         // false - 如有一个为false，结果则为false，两者为true，结果才为true
        System.out.println(x || y);         // true  - 如有一个为true，结果则为true
        System.out.println(!(x && y));      // true  - 取反，括号内为true，结果则为false，括号内为false，结果则为true

        System.out.println("Operator Demo");

        // bit operations
        int x1 = 4;  // 0100
        int x2 = 5;  // 0101
        System.out.println(x1 & x2);   // 0100  -  4
        System.out.println(x1 | x2);   // 0101  -  5
        System.out.println(x1 ^ x2);   // 0001  -  1
        System.out.println(~x1);       //  -5
        System.out.println(~x2);       //  -6

        // shift operators
        int x3 = 4;
        System.out.println(x3<<4);              // 64 = x3*2*2*2*2
        System.out.println(x3>>2);              // 1 = (x3/2)/2

        // expression1 ? expression2 : expression3
        int x4 = 8;
        System.out.println(x4 < 9 ? "x is smaller!" : "x is bigger!");  // x is smaller!
     }
}
