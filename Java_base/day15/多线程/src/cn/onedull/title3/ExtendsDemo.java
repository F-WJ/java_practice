/*
����ʹ�ü̳з�ʽʵ�ֳ�ƻ���������̲߳���ȫ��

����:
(1)�����Զ�����ThreadApple�̳�Thread
(2)����run����
(3)��main�����ﴴ������ThreadApple����, ����������Ϊ�߳�����
(4)��������ThreadApple�����start����, �۲���

�ܽ�:
(1)ͨ���̳з�ʽ�����������߳�, ���ܶ���̹߳���һ����Դ(ǰ������, �߳��������new�˶��)

*/
package cn.onedull.title3;

public class ExtendsDemo {

	public static void main(String[] args) {
		//��������
		ThreadApple ta1 = new ThreadApple("СA");
		ThreadApple ta2 = new ThreadApple("СB");
		ThreadApple ta3 = new ThreadApple("СC");
		//�����߳�
		ta1.start();
		ta2.start();
		ta3.start();
	}

}


class ThreadApple extends Thread{
	//ƻ������
	private int applecount = 50;  
	
	
	public ThreadApple(String name) {
		super(name);
	}
	public void run() {
		
		while(true) {
			System.out.println(getName() + "����һ��ƻ��" + ", ��ʣ��" + --applecount);
			if(applecount == 0) {
				System.out.println(getName() + "�˳�");
				break;
			}
		}
	}
}
