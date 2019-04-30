/*
需求：使用继承方式实现吃苹果案例（线程不安全）
作业目的：巩固继承方式创建并启动线程

步骤:
(1)定义自定义类实现Rnnable接口
(2)覆盖run方法
(3)在main方法里创建自定义类对象
(4)创建Thread类对象
(5)把自定义类对象作为Tread类构造器参数
(6)调用Tread对象的start方法

总结:
(1)利用实现Runnable接口, 在启动线程的时候, 只能依赖Thread, 因为Runnable本身只有run方法
*/
package cn.onedull.title2;

public class ThreadDemo2 {

	public static void main(String[] args) {
		//创建对象
		MyRunnable mb = new MyRunnable();
		//创建thread对象
		Thread t1 = new Thread(mb);
		Thread t2 = new Thread(mb);
		//调用Thread类的start方法
		t1.start();
		t2.start();
		
//		while(true) {
//			System.out.println("主方法");
//		}
	}

}



class MyRunnable implements Runnable{
	//覆盖run方法
	public void run() {

		for(int i = 40; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
