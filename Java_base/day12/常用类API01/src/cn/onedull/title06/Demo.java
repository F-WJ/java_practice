/*
������ʾString �еĳ��÷����ĵ��ã�9 �� )

����:
(1)���ò�����Demo, ����һ��String��, ���ó��õ�9������

�ܽ�:
(1)ʹ��substringע��, ������������ֵ�ǲ�����Ҫ��ȡ�����ķ�Χ��
*/
package cn.onedull.title06;

public class Demo {

	public static void main(String[] args) {
		String str1 = "ABCDEFG";
		String str2 = "ABCDEFG";
		//�ַ�������
		int size = str1.length();
		System.out.println(size);
		//ͨ����������ĳһֵ
		char num = str1.charAt(0);
		System.out.println(num);
		//����equals�ж������ַ�����ֵ�Ƿ����
		boolean b1 = str1.equals(str2);
		System.out.println(b1); //true
		//��ĳһ������ʼ, ֱ�������������, ��Ƭ
		String str3 = str1.substring(1);
		System.out.println(str3);
		//��ĳһ������ʼ, ֱ��ĳһ��������, ��Ƭ
		String str4 = str1.substring(5, 6);
		System.out.println(str4);
	}

}
