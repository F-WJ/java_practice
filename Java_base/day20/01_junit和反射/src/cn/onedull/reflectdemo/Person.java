package cn.onedull.reflectdemo;

import java.util.Arrays;

public class Person {

    // 成员方法

    // 无参无返回的方法
    public void method1() {

       System.out.println("无参无返回的public方法被执行");

    }

    // 有参无返回的方法
    public void method2(String name) {

       System.out.println("有参无返回的public方法被执行 name= " + name);

    }

    // 无参有返回的方法
    public int method3() {

       System.out.println("无参有返回的public方法被执行");

       return 123;

    }

    // 有参有返回方法
    public String method4(String name) {

       System.out.println("有参有返回方法的public方法被执行");

       return "哈哈" + name;

    }

    // 私有方法
    private void method5() {

       System.out.println("private私有方法被执行");

    }

 

    //静态方法
    public static void method6(String name){

       System.out.println("静态方法被执行 name= "+ name);

    }


    //参数是基本数据类型的数组
    public void method7(int... arr){

       System.out.println("参数是基本数据类型的数组的方法被执行arr= "+ Arrays.toString(arr));

    }

    //参数是引用数据类型的数组
    public void method8(String... arr){

       System.out.println("参数是引用数据类型的数组的方法被执行arr= "+ Arrays.toString(arr));

    }

}