/*
������ʾ���񵥸��쳣try-catch ��ʹ��


����:
(1)����һ��divide����,  ���㴫����������,  ����try-catch�쳣
(2)��main�����е���divide����, ����

�ܽ�:
(1)�쳣һ������, catch�����ִ��
*/
package cn.odedull.title1;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		divide(5, 0);
	}
	
	static void divide(int a , int b) {
		try {
			int div = a / b;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
			// ��֪����һ�г���
			e.printStackTrace();
		}
	
		
		
	}

}
