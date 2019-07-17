package cn.wolfcode.crm.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  //生命周期
@Target(ElementType.METHOD)  //指定使用之处
public @interface RequriedPermission {
    String name(); //得到方法名
}
