/*
需求：我家有一种动物（Animal），你猜它的叫声（shout）是怎么样的，猜不到，因为这个
动物有多种形态。
如果该动物是狗（Dog），叫声是：旺旺旺...
如果该动物是猫（Cat），叫声是：妙妙妙...

步骤:
(1)先创建父类Animal(动物), 子类Cat(猫), Dog(狗),  三个都编写一个say方法
(2)创建一个测试类(TestDemo), 创建对象,  不过语法是父类名  变量名 = new 子类, 实现多态
(3)调用say方法

总结:
(1)多态的前提是类与类是继承关系
(2)多态, 父类调用方法实际是调用子类的方法
 */
package cn.onedell.polymorphism_demo;

public class TestDemo {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.say();
		Animal a2 = new Cat();
		a2.say();
	}
}
