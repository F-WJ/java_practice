/*
需求：演示final 修饰符的特点

步骤:
(1)使用final修饰符创建一个father1类
(2)创建一个Father对象,  定义一个final修饰符的say方法
(3)创建一个子类Son, 继承fathter, 定义一个final修饰符成员变量
(4)创建测试类, 创建对象, 重新赋值age的值


总结:
(1)final修饰的类：表示最终的类, 该类不能再有子类
(2)final修饰的方法：最终的方法, 该方法不能被子类覆盖
(3)final修饰的变量：表示常量，该变量只能赋值一次，不能再重新赋值。如果是基本数据类, 表示的值不能改变;
而引用数据类型,所引用的地址值不能改变
*/ 
package cn.onedull.final_demo;

public class FinalDemo {
	public static void main(String[] args) {
		//创建对象
		Son son = new Son();
		//son.age = 11;  //The final field Son.age cannot be assigned
	}

}
