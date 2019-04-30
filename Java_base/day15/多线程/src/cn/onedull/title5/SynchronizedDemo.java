/*
����ʹ��ʵ�ַ�ʽʵ�ֳ�ƻ��������ͬ������飩

����:
����:
(1)�����Զ�����ThreadAppleʵ��Runnable�ӿ�
(2)����run����, ʹ��synchroizedͬ����ʵ��ͬ������
(3)��main�����д����Զ���������Thread�����
(4)����Thread�����start����, �����߳�

�ܽ�:
(1)synchroizedͬ������������˭�õ�����ִ�д���, �����߳�ֻ�ܵȴ�.
*/
package cn.onedull.title5;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// ����ThreadApple����
		ThreadApple ta = new ThreadApple();
		// ����Thread����
		Thread th1 = new Thread(ta, "С��");
		Thread th2 = new Thread(ta, "����");
		// �����߳�
		th1.start();
		th2.start();
	}

}

class ThreadApple implements Runnable {
	// ƻ������
	private int apple = 5;

	public void run() {
		while (true) {
//			System.out.println("ǰ��");
			//ͬ����
			synchronized (this) {
				if (apple > 0) {
					
					 try { 
						 Thread.sleep(2000); 
					 } catch (InterruptedException e) {
					}
					 
					System.out.println(Thread.currentThread().getName() + "����һ��ƻ��" + ", ��ʣ��" + --apple);
				} else {
					System.out.println(Thread.currentThread().getName() + "�˳�");
					break;
				}

			}
//			System.out.println("����");
		}
	}

}
