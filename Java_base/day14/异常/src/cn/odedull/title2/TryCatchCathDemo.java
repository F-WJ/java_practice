/*
������ʾ�������쳣try-catc-catch ��ʹ��

����:
(1)����һ��divide����, ���㴫�������ַ���ת��֮��, ���Ľ��, ����try-catch-atch�쳣
(2)��main�����е���divide����, ����


�ܽ�:
(1)���쳣����ʱ, ��ִ�����Ӧ��cache���, ����ͬʱ�ж���쳣ͬʱ����
*/
package cn.odedull.title2;

public class TryCatchCathDemo {
	public static void main(String[] args) {
		divide("5" , "0a");
	}



	static void divide(String str1, String str2) {
		try {
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int div = num1 / num2;
		}catch(ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}catch(NumberFormatException e) {
			System.out.println("��������");
		}catch(Exception e) {
			System.out.println("δ֪����");
		}
	}


}
