/*
����ʹ��ʵ�ַ�ʽʵ�ֳ�ƻ��������ͬ��������

����:
(1)�����Զ�����ThreadAppleʵ��Runnable�ӿ�
(2)����run����, ʹ��synchroized����ʵ��ͬ������
(3)��main�����д����Զ���������Thread�����
(4)����Thread�����start����, �����߳�

�ܽ�:
(1)ʹ��synchroized, ��ȫ, �����ܻή��
*/
package cn.onedull.title6;

public class SynchronizedDemo2 {

	public static void main(String[] args) {
		//����ThreadApple����
		ThreadApple ta = new ThreadApple();
		//����Thread����
		Thread th1 = new Thread(ta, "С��");
		Thread th2 = new Thread(ta, "Сè");
		Thread th3 = new Thread(ta, "С��");
		//�����߳�
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
			System.out.println(Thread.currentThread().getName() + "����һ��ƻ��" + ", ��ʣ��" + --apple);
			return false;
		}else {
			System.out.println(Thread.currentThread().getName() + "�˳�");
			return true;
		}
	
		
	}
}