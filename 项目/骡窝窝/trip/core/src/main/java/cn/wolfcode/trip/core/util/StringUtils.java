package cn.wolfcode.trip.core.util;

import java.lang.reflect.Method;

public class StringUtils {

    //处理表达式
    public static String getExpression(Method method){
        String name = method.getDeclaringClass().getSimpleName();
        name = name.replace("Controller", "");
        //获取方法名
        String methodName = method.getName();
        //合并
        name = name +  ":" + methodName;

        System.out.println(methodName);
        return name;
    }

}
