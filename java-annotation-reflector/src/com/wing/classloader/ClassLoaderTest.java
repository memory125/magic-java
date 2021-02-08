package com.wing.classloader;

/**
 * @author memory125
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器->跟加载器(C/C++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // 测试当前类的加载器
        Class aClass = Class.forName("com.wing.classloader.ClassLoaderTest");
        System.out.println(aClass.getClassLoader());

        // 测试JDK类的加载器
        ClassLoader classLoader = Class.forName("java.lang.System").getClassLoader();
        System.out.println(classLoader);


        /*
            运行结果如下:
            sun.misc.Launcher$AppClassLoader@18b4aac2
            sun.misc.Launcher$ExtClassLoader@1b6d3586
            null
            sun.misc.Launcher$AppClassLoader@18b4aac2
            null
         */

        // 获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
            $JAVA_HOME\jre\lib\charsets.jar;
            $JAVA_HOME\jre\lib\deploy.jar;
            $JAVA_HOME\jre\lib\ext\access-bridge-64.jar;
            $JAVA_HOME\jre\lib\ext\cldrdata.jar;
            $JAVA_HOME\jre\lib\ext\dnsns.jar;
            $JAVA_HOME\jre\lib\ext\jaccess.jar;
            $JAVA_HOME\jre\lib\ext\jfxrt.jar;
            $JAVA_HOME\jre\lib\ext\localedata.jar;
            $JAVA_HOME\jre\lib\ext\nashorn.jar;
            $JAVA_HOME\jre\lib\ext\sunec.jar;
            $JAVA_HOME\jre\lib\ext\sunjce_provider.jar;
            $JAVA_HOME\jre\lib\ext\sunmscapi.jar;
            $JAVA_HOME\jre\lib\ext\sunpkcs11.jar;
            $JAVA_HOME\jre\lib\ext\zipfs.jar;
            $JAVA_HOME\jre\lib\javaws.jar;
            $JAVA_HOME\jre\lib\jce.jar;
            $JAVA_HOME\jre\lib\jfr.jar;
            $JAVA_HOME\jre\lib\jfxswt.jar;
            $JAVA_HOME\jre\lib\jsse.jar;
            $JAVA_HOME\jre\lib\management-agent.jar;
            $JAVA_HOME\jre\lib\plugin.jar;
            $JAVA_HOME\jre\lib\resources.jar;
            $JAVA_HOME\jre\lib\rt.jar;
            $java-project\production\current-java-project;
            $IDEA_HOME\lib\idea_rt.jar
         */
    }
}
