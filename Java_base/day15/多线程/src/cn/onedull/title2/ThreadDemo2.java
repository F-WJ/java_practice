/*
����ʹ�ü̳з�ʽʵ�ֳ�ƻ���������̲߳���ȫ��
��ҵĿ�ģ����̼̳з�ʽ�����������߳�

����:
(1)�����Զ�����ʵ��Rnnable�ӿ�
(2)����run����
(3)��main�����ﴴ���Զ��������
(4)����Thread�����
(5)���Զ����������ΪTread�๹��������
(6)����Tread�����start����

�ܽ�:
(1)����ʵ��Runnable�ӿ�, �������̵߳�ʱ��, ֻ������Thread, ��ΪRunnable����ֻ��run����
*/
package cn.onedull.title2;

public class ThreadDemo2 {

	public static void main(String[] args) {
		//��������
		MyRunnable mb = new MyRunnable();
		//����thread����
		Thread t1 = new Thread(mb);
		Thread t2 = new Thread(mb);
		//����Thread���start����
		t1.start();
		t2.start();
		
//		while(true) {
//			System.out.println("������");
//		}
	}

}



class MyRunnable implements Runnable{
	//����run����
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
