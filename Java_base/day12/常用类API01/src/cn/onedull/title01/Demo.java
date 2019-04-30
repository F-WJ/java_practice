/*
需求：使用static 方法的方式定义一个数组的工具类，并测试

步骤:
(1)创建个数组工具类Arrayutil, 构造器私有化, 创建一个公共静态方法toString
(2)创建测试类Demo, 在main方法上直接用类名调用方法

总结:
(1)使用static修饰后方法, 可以直接使用类来调用
*/
package cn.onedull.title01;

public class Demo {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4};
		//直接通过类名调用方法
		String str = ArrayUtil.toString(arr);
		System.out.println(str);
	}	
}
