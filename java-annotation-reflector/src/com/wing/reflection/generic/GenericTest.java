package com.wing.reflection.generic;

import com.wing.reflection.classmodules.UserInfo;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author memory125
 */
public class GenericTest {
    public static void main(String[] args) throws NoSuchMethodException {
        // 获取声明的方法test01对象
        Method method1 = GenericTest.class.getDeclaredMethod("test01", Map.class, List.class);

        // 获取方法的泛型参数类型
        System.out.println("============================test01=============================");
        Type[] genericParameterTypes = method1.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("getGenericParameterTypes: " + genericParameterType);
            if (genericParameterType instanceof ParameterizedType) {
                // 获取实际参数类型
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("#1---------getActualTypeArguments: " + actualTypeArgument);
                }
            }
        }

        // 获取声明的方法test02对象
        Method method2 = GenericTest.class.getDeclaredMethod("test02", null);

        // 获取方法的返回泛型类型
        System.out.println("============================test02=============================");
        Type genericReturnType = method2.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            // 获取实际参数类型
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("#2---------getActualTypeArguments: " + actualTypeArgument);
            }
        }
    }

    // 输入参数是泛型类型
    public void test01(Map<String, UserInfo> map, List<UserInfo> list) {
        System.out.println(this.getClass().getName() + "==================>test01");
    }

    // 返回值是泛型类型
    public Map<String, UserInfo> test02() {
        Map<String, UserInfo> map = null;
        System.out.println(this.getClass().getName() + "==================>test02");
        return map;
    }
}
