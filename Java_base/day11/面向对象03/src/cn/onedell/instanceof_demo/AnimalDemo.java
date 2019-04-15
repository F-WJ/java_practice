/*
需求：演示类型转换和instanceof 关键字的使用

步骤:
(1)创建一个animal父类和两个子类pig和dog
(2)两个子类通过extends继承父类
(3)动物类和pig实现多态
(3)通过instanceof来判断该对象是否是动物类的实例


总结:
(1)如果把子类对象赋给父类变量, 为自动类型转换
(2)如果父类类型对象赋子类类型变量, 叫强转类型装换, 前提该对象的真实类型是子类类型
 */
package cn.onedell.instanceof_demo;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Pig();
		Pig p = (Pig)a;
		a.say();
		System.out.println(a instanceof Pig); //true
		System.out.println(a instanceof Animal); //true
		System.out.println(a instanceof Dog); //false
		
	}
}
