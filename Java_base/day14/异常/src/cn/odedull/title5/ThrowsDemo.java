/*
需求：演示返回异常throws 的使用

步骤:
(1)定义一个Demo类
(2)定义一个static方法, 为计算两个数的除
(3)使用throws抛出异常

总结:
(1)throws是写在方法声明中, 是提醒调用者该方法有可能存在异常
*/
package cn.odedull.title5;

public class ThrowsDemo {
	public static void main(String[] args) throws Exception {
		Divide(5, 1);
	}


	static void Divide(int a, int b) throws Exception{
		int div = a / b;
	}
}