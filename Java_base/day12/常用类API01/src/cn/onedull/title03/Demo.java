/*
 ���󣺰�װ�ࡢ�����������͡�String ���ߵĻ���
 
 ����:
 (1)����һ��Demo��, ʹ��int��������������ʾ��װ�ͻ���������ת��
 (2)����Integer���parseInt���������ַ���װ��Ϊint����
 
 �ܽ�:
 (1)�������Ͱ�װ��������Ϊ�������͵ļ�ǿ��, ���úܶ෽��.
*/
package cn.onedull.title03;

public class Demo {	
	public static void main(String[] args) {
		//װ��
		Integer num1 = Integer.valueOf(6); 
		System.out.println(num1);
		//����
		int num2 = num1.intValue();
		System.out.println(num2);
		
		System.out.println("----------------");
		//java5�Զ�װ��Ͳ������
		Integer num3 = 17;
		int num4 = num3;
		System.out.println(num3 + ", " + num4);
		
		System.out.println("----------------");
		
		//�ַ���װint����
		//int num5 = Integer.parseInt("123y4"); //java.lang.NumberFormatException
		Integer num5 = Integer.parseInt("123456");
		System.out.println(num5);
	}
	
}
