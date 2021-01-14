import java.util.Enumeration;
import java.util.Properties;

public class RuntimeEnv {
    public static void main(String[] args) {
        // 获取CPU核数
        System.out.println("The runtime CPU is " + Runtime.getRuntime().availableProcessors());
        // 内存大小
        System.out.println("The runtime memory is " + Runtime.getRuntime().totalMemory());
        // 空闲内存
        System.out.println("The runtime free memory is " + Runtime.getRuntime().freeMemory());
        // 系统名称
        System.out.println("The runtime OS is " + System.getProperty("os.name"));
        // 系统版本
        System.out.println("The runtime OS version is " + System.getProperty("os.version"));
        // JDK版本
        System.out.println("The runtime java  version is " + System.getProperty("java.version"));

        // 获取系统及JDK属性
        Properties properties = System.getProperties();
        Enumeration eprops = properties.propertyNames();
        while(eprops.hasMoreElements()){
            // 获取属性名称
            String key = (String)eprops.nextElement();
            // 获取属性值
            String value = System.getProperty(key);
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
