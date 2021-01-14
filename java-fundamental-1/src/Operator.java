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
        System.out.println(a /(double)b);  //0.5

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



        System.out.println("Operator Demo");
    }
}
