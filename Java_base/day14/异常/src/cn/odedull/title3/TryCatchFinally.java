/*
������ʾ�������쳣try-catc-finally ��ʹ��

����:
(1)����һ��divide����, �������������ĳ�, ����try-catch-finally�쳣����
(2)��main�����е��÷���, ����

�ܽ�:
(1)finally�����Ƿ���ڴ���, finally�鶼��ִ��
(2)�����try�������catch�������JVM�˳�����( System.exit(0);), 
	finally�鲻�ᱻִ��.
*/

package cn.odedull.title3;

public class TryCatchFinally {

	public static void main(String[] args) {
		divide(5, 0);
	}
		
	static void divide(int a, int b) {
		try {
			int div = a / b;
		}catch(Exception e) {
			System.out.println("��������Ϊ0");
			//System.exit(0);
		}
		finally {
			System.out.println("��һ��");
		}
	}
	

}
