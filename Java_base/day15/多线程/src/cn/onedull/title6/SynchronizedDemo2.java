/*
需求：使用实现方式实现吃苹果案例（同步方法）

步骤:
(1)定义自定义类ThreadApple实现Runnable接口
(2)覆盖run方法, 使用synchroized方法实现同步代码
(3)在main方法中创建自定义类对象和Thread类对象
(4)调用Thread对象的start方法, 启动线程

总结:
(1)使用synchroized, 安全, 但性能会降低
*/
package cn.onedull.title6;

public class SynchronizedDemo2 {

	public static void main(String[] args) {
		//创建ThreadApple对象
		ThreadApple ta = new ThreadApple();
		//创建Thread对象
		Thread th1 = new Thread(ta, "小熊");
		Thread th2 = new Thread(ta, "小猫");
		Thread th3 = new Thread(ta, "小狗");
		//启动线程
		th1.start();
		th2.start();
		th3.start();
		
	}

}

class ThreadApple implements Runnable{
	private int apple = 50;
	public void run() {
		while(true) {
			boolean result = this.eat();
			if(result) {
				break;
			}
		}
	}
	
	synchronized private boolean  eat(){
		if(apple > 0) {
			System.out.println(Thread.currentThread().getName() + "吃了一个苹果" + ", 还剩下" + --apple);
			return false;
		}else {
			System.out.println(Thread.currentThread().getName() + "退出");
			return true;
		}
	
		
	}
}