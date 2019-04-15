/*
需求：定义一个狗类Dog，在狗类中定义静态字段和静态方法，定义对象字段和对象方法，
并在StaticDemo 方法中测试调用狗类中的方法和字符
作业目的：理解static 关键字的含义和使用

步骤:
(1)创建一个Dog类, 定义一个静态变量age和一个私人成员变量(遵守JavaBean规范)
(2)创建测试类StaticDemo , 直接使用类名调用静态方法和静态变量.
(3)创建对象后, 调用对象方法和字段.

总结:
(1)使用了static修饰的字段和方法, 直接属于类, 使用的时候直接使用类名调用就好
*/

package cn.onedull.static_demo;

public class StaticDemo {
	public static void main(String[] args) {
		Dog.say();
		Dog.age = 11;
		//创建对象
		Dog d = new Dog();
		d.setName("阿旺");
		d.eat();
	}
}
