/*
需求：作为Cat 类和对象的测试类

步骤：
Cat类
(1) 猫有名字、年龄等状态
(2) 说话的功能

CatDemo类
（1）创建Cat 对象c
（2）使用c 对象调用说话方法
（3）给对象成员变量设置值
（4）再使用c 对象调用说话方法，观察成员变量的值的改变
（5）获取c 对象的成员变量

总结:
(1)类就是多个实体的整体描述, 而对象就是该类的事物的具体表现
(2)创建对象语法: 类名 对象变量名 = new 类名();
 */
package cn.onedull.cat_class1;

public class CatDemo {
	public static void main(String[] args) {
		//创建对象
		Cat c = new Cat();
		//调用方法
		c.say();
		//设置值
		c.name = "小柯";
		c.say();
		//获取对象的成员变量
		String name = c.name;
		System.out.println(name);
	}
}
