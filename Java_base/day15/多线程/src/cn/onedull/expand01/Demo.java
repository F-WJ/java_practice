/*
1�����д���������߳������A��Z����ĸ��ÿ��һ�������һ�����֣��밴˳�������

����:
(1)���ü̳з�ʽ����һ���Զ����߳���
(2)����ASCII��A~Z�ı���65~90, forѭ����ӡ
(3)����Thread���sleep����, ÿ��һ���ӡһ����ĸ

�ܽ�:
(1)Thread���sleep����, ��ʱ��ͣ��ǰ���߳�
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
