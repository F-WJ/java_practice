/*
需求：使用实现方式实现吃苹果案例（同步代码块）

步骤:
步骤:
(1)定义自定义类ThreadApple实现Runnable接口
(2)覆盖run方法, 使用synchroized同步锁实现同步代码
(3)在main方法中创建自定义类对象和Thread类对象
(4)调用Thread对象的start方法, 启动线程

总结:
(1)synchroized同步锁意义在于谁拿到锁就执行代码, 其他线程只能等待.
*/
package cn.onedull.title5;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// 创建ThreadApple对象
		ThreadApple ta = new ThreadApple();
		// 创建Thread对象
		Thread th1 = new Thread(ta, "小乔");
		Thread th2 = new Thread(ta, "大乔");
		// 启动线程
		th1.start();
		th2.start();
	}

}

class ThreadApple implements Runnable {
	// 苹果总数
	private int apple = 5;

	public void run() {
		while (true) {
//			System.out.println("前面");
			//同步锁
			synchronized (this) {
				if (apple > 0) {
					
					 try { 
						 Thread.sleep(2000); 
					 } catch (InterruptedException e) {
					}
					 
					System.out.println(Thread.currentThread().getName() + "吃了一个苹果" + ", 还剩下" + --apple);
				} else {
					System.out.println(Thread.currentThread().getName() + "退出");
					break;
				}

			}
//			System.out.println("后面");
		}
	}

}
