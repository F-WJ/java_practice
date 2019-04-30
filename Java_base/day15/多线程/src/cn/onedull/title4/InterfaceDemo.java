/*
����ʹ��ʵ�ַ�ʽʵ�ֳ�ƻ���������̲߳���ȫ��

����:
(1)�����Զ�����ʵ��Runnable�ӿ�
(2)����run����, ͨ��while��if����д��ƻ������
(3)��main�����ﴴ��TreadApple����
(4)����Thread����, ����TreadApple������߳�������Ϊ����������

�ܽ�:
(1)ͨ��ʵ�ַ�ʽ���Զ���̹߳���һ����Դ, ��Ϊ�Զ����߳���ֻnew��һ��
*/
package cn.onedull.title4;

public class InterfaceDemo {

	public static void main(String[] args) {
		//����TreadApple����
		ThreadApple ta = new ThreadApple();
		//����Thread����, ����������TreadApple������߳�����
		Thread th1 = new Thread(ta, "СԽ");
		Thread th2 = new Thread(ta, "С��");
		Thread th3 = new Thread(ta, "СĿ");
		//�����߳�
		th1.start();
		th2.start();
		th3.start();
	}

}


class ThreadApple implements Runnable{
	private int apple = 5;  //ƻ������
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "����һ��ƻ��" + ", ��ʣ��" + --apple);
			if(apple < 1) {
				System.out.println(Thread.currentThread().getName() + "��̨");
				break;
			}
		}
	}
}
