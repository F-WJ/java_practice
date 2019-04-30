/*
需求：使用实现方式实现吃苹果案例（线程不安全）

步骤:
(1)定义自定义类实现Runnable接口
(2)覆盖run方法, 通过while和if语句编写吃苹果流程
(3)在main方法里创建TreadApple对象
(4)创建Thread对象, 并把TreadApple对象和线程名字作为构造器参数

总结:
(1)通过实现方式可以多个线程共享一个资源, 因为自定义线程类只new了一次
*/
package cn.onedull.title4;

public class InterfaceDemo {

	public static void main(String[] args) {
		//创建TreadApple对象
		ThreadApple ta = new ThreadApple();
		//创建Thread对象, 并参数传入TreadApple对象和线程名字
		Thread th1 = new Thread(ta, "小越");
		Thread th2 = new Thread(ta, "小淋");
		Thread th3 = new Thread(ta, "小目");
		//启动线程
		th1.start();
		th2.start();
		th3.start();
	}

}


class ThreadApple implements Runnable{
	private int apple = 5;  //苹果总数
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "吃了一个苹果" + ", 还剩下" + --apple);
			if(apple < 1) {
				System.out.println(Thread.currentThread().getName() + "下台");
				break;
			}
		}
	}
}
