/*
需求：使用继承方式实现吃苹果案例（线程不安全）

步骤:
(1)定义自定义类ThreadApple继承Thread
(2)覆盖run方法
(3)在main方法里创建三个ThreadApple对象, 构造器参数为线程名字
(4)调用三个ThreadApple对象的start方法, 观察结果

总结:
(1)通过继承方式创建和启动线程, 不能多个线程共享一个资源(前提条件, 线程子类必须new了多次)

*/
package cn.onedull.title3;

public class ExtendsDemo {

	public static void main(String[] args) {
		//创建对象
		ThreadApple ta1 = new ThreadApple("小A");
		ThreadApple ta2 = new ThreadApple("小B");
		ThreadApple ta3 = new ThreadApple("小C");
		//启动线程
		ta1.start();
		ta2.start();
		ta3.start();
	}

}


class ThreadApple extends Thread{
	//苹果总数
	private int applecount = 50;  
	
	
	public ThreadApple(String name) {
		super(name);
	}
	public void run() {
		
		while(true) {
			System.out.println(getName() + "吃了一个苹果" + ", 还剩下" + --applecount);
			if(applecount == 0) {
				System.out.println(getName() + "退出");
				break;
			}
		}
	}
}
