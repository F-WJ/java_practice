/*
 需求：定义一个ClothType 枚举类，表示衣服分类的三种情况：男装、女装、中性服装
并在测试类中获取枚举中的常量对象，并调用枚举中的name、ordinal 方法。
作业目的：定义枚举类和枚举的使用

步骤:
(1)创建一个枚举类ClothType, 设置三个常量对象MAN
(2)创建一个测试类Demo, 直接使用类调用name, ordinal方法

总结:
(1)枚举类不能创建对象, 使用的时候, 直接调用枚举类就好
*/

package cn.onedull.enum_demo;

public class Demo {
	public static void main(String[] args) {
		//直接使用类调用
		String name = ClothType.MAN.name();
		System.out.println(name);
		int num = ClothType.MAN.ordinal();
		System.out.println(num);
	}
}
