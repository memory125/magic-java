import com.wing.module.User;
import java.util.Random;
/**
 * @author memory125
 */
public class Syntax {
    public static void main(String[] args) {
        User user = new User();
        user.setName("H1");
        user.setId(new Random().nextLong());
        user.setAddr("Shenzhen,Guangdong,China");
        user.setAge(23);
        user.setGender("Male");
        user.setSalary(9000.0);

        System.out.println("User Information: ");
        System.out.println(user.getId() + "\t" +
                user.getName() + "\t" +
                user.getGender() + "\t" +
                user.getAge() + "\t" +
                user.getAddr() + "\t" +
                user.getSalary());


        System.out.println("The Syntax Demo!");
    }
}
