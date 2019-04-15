/*
需求：演示匿名内部类用法
 定义一个父类Animal 和一个接口IUSB
 在测试类中创建一个Animal 的子类匿名内部类和IUSB 的实现类匿名内部类
作业目的：掌握匿名内部类的语法和使用

步骤:
(1)创建一个IUSB接口, 抽象方法为say
(2)创建一个父类Animal, 成员方法plugin
(3)创建测试类Demo, 创建Aniaml对象,  和新建一个匿名内部类, 放到Anniaml对象调用方法的参数里面.


总结:
(1)当我们某一接口实现类只使用一次的时候, 可以使用匿名内部类
*/
package cn.onedull.usb_demo;

public class Demo {
	public static void main(String[] args) {
		//创建对象
		IUSB u = new IUSB() {
			public void say() {
					System.out.println("ceshi");
			}
			
		};
		Animal a = new Animal();
		a.plugin(u);
		
		
	}
	
	
}
