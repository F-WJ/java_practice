/*
����
�ж�һ���ַ����Ƿ�ȫ�����������
�ж�һ���ַ����Ƿ����ֻ�����
�ж�һ���ַ����Ƿ���18 λ���֤����
�ж�һ���ַ����Ƿ�6 ��16 λ���ҵ�һ���ֱ���Ϊ��ĸ

����:
(1)�ȴ���һ���ַ���, ���Ҫƥ��Ĺ���
(2)�����ַ�����matches����, ����ƥ��.

�ܽ�:
(1)ע��ת��
*/
package cn.onedull.title08;

public class Demo {

	public static void main(String[] args) {
		//�ж�һ���ַ��Ƿ�ȫ�����������
		System.out.println("12345678".matches("\\d*"));  //true
		System.out.println("123456wew8".matches("\\d*"));  //false
		
		//�ж�һ���ַ����Ƿ����ֻ�����
		String re = "1[3|4|5|7|8|9][0-9]{9}$";
		System.out.println("12728345676".matches(re));  //false
		System.out.println("13545676545".matches(re));  //true
		
		//�ж�һ���ַ����Ƿ�18λ���֤����
		String re2 = "\\d{17}[[0-9]X]";
		System.out.println("234565432345676522".matches(re2));  //true
		System.out.println("22223124553453453X".matches(re2));  //true
		System.out.println("22223124553453453A".matches(re2));  //false
		
		//�ж�һ���ַ����Ƿ�6��16λ, ���ҵ�һ���ӱ���Ϊ��ĸ
		String re3 = "^[a-zA-z]\\w{5,15}$";
		System.out.println("fwj12112".matches(re3));   //true
		System.out.println("12112".matches(re3));   //false
	}

}
