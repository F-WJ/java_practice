/*
��дһ������:
	����һ��  int ֵ , ���ظ�ֵ��λ��
		����  123   ���� 3 λ��
		      1     ���� 1 λ��
		      10    ���� 2 λ��
		      
˼·: ��int����װ���, ʹ��String����ת��String����, Ȼ��ͨ��String���length()��ͳ����

*/
package cn.onedull.string10;

public class Demo {

	public static void main(String[] args) {
		int a = 123;
		//���÷���
		int size = Demo.getNum(a);
		System.out.println(size);
	}
	
	static int getNum(int a) {
		Integer num = Integer.valueOf(a);
		String str = num.toString();
		int size = str.length();
		
		return size;
	}

}
