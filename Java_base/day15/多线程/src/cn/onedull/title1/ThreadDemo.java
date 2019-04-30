/*
需求：使用继承方式创建并启动线程

步骤:
(1)先自定义一个继承了Tread的类
(2)覆盖父类run方法
(3)在main方法上创建自定义类对象
(4)调用start方法, 启动线程

总结:
(1)启动线程, 只能使用start方法, 直接调用run方法是不会启动新的线程
*/
package cn.onedull.title1;

public class ThreadDemo {

	public static void main(String[] args) {
		//创建对象
		Mythread m = new Mythread();
		//启动线程
		m.start();
	
	}
}


class Mythread extends Thread{
	public void run() {
		System.out.println("新线程");
	}
}
