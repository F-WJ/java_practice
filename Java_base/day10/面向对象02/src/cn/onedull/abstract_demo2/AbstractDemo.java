/*
需求：演示抽象类特点
抽象类不能创建对象，调用没有方法体的抽象方法没有任何意义
抽象类中可以同时拥有抽象方法和普通方法
抽象类要有子类才有意义，子类必须覆盖父类的抽象方法，否则子类也得作为抽象类

步骤:
(1)创建一个Abstract抽象类,和一个子类(Test), 里面有一个抽象方法test和一个普通方法common
(2)创建一个AbstractDemo测试类, 创建test对象, 调用Abstract的抽象方法和普通方法

总结:
(1)抽象类不能创建对象
(2)抽象类可以同时拥有抽象方法和普通方法
(3)抽象类要有子类才有意义,子类去继承抽象类, 然后覆盖抽象类的抽象方法.
 */

package cn.onedull.abstract_demo2;

public class AbstractDemo {

	public static void main(String[] args) {
		Test test = new Test();
		test.test();  //覆盖父类抽象方法
		test.common(); //调用抽象类里的普通方法

	}

}
