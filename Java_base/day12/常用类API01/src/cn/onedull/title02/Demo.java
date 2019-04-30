/*
需求：使用单例设计模式定义一个数组的工具类，并测试

步骤:
(1)创建一个ArrayUtil工具类, 私有化构造器, 创建一个对象, 创建一个方法来返回对象给调用者使用
(2)创建一个测试类Demo, 直接使用类名调用getUtil方法

总结:
(1)单例模式设计, 要记住私有化构造器, 创建该类的对象的时候, 要私有, 静态修饰,
	而方法使用public修饰, 方法体为返回该类对象.
*/
package cn.onedull.title02;

public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 4, 5, 6};
		//调用方法
		String str = ArrayUtil.getUtil().toString(arr);
		System.out.println(str);
	}

}
