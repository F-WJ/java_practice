/*
����ʹ�ü̳з�ʽ�����������߳�

����:
(1)���Զ���һ���̳���Tread����
(2)���Ǹ���run����
(3)��main�����ϴ����Զ��������
(4)����start����, �����߳�

�ܽ�:
(1)�����߳�, ֻ��ʹ��start����, ֱ�ӵ���run�����ǲ��������µ��߳�
*/
package cn.onedull.title1;

public class ThreadDemo {

	public static void main(String[] args) {
		//��������
		Mythread m = new Mythread();
		//�����߳�
		m.start();
	
	}
}


class Mythread extends Thread{
	public void run() {
		System.out.println("���߳�");
	}
}
