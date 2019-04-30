/*
1、请编写程序利用线程输出从A到Z的字母，每隔一秒钟输出一个数字，请按顺序输出。

步骤:
(1)利用继承方式创建一个自定义线程类
(2)利用ASCII里A~Z的编码65~90, for循环打印
(3)加上Thread类的sleep方法, 每隔一秒打印一个字母

总结:
(1)Thread类的sleep方法, 暂时暂停当前的线程
*/
package cn.onedull.expand01;

public class Demo {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.start();
	}

}


class ThreadDemo extends Thread{
	public void run() {
		//65 ~ 90 A ~ Z
		for(int i = 65; i <= 90; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
