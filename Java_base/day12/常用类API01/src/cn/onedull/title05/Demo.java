/*
����
��ʾString �ഴ����������ַ�ʽ����ʹ��== ��equals �������бȽ�
�ж��ַ����ǿ�

����:
(1)����һ��Demo��, ����String��
(2)����if����ж��ַ����Ƿ�ǿ�

�ܽ�:
(1)�ַ����ǿɱ��, ÿһ�����¸�ֵ,��ֵַ����䶯.
(2)�ж������ַ���ʹ��equals, ��Ҫʹ��==, ==�ж����ڴ��ַ�Ƿ���ͬ.
*/
package cn.onedull.title05;

public class Demo {

	public static void main(String[] args) {
		//�����ַ���(��һ�ַ�ʽ)
		String str1 = "123";
		//�ڶ��ַ�ʽ
		String str2 = new String("123");
		
		//==��equals�����Ա������ַ���
		boolean b1 = str1 == str2;  // false
		System.out.println(b1);
		boolean b2 = str1.equals(str2);  //true
		System.out.println(b2);
		
		boolean b3 = str1 == null && "".equals(str1.trim()); 
		System.out.println(b3); //false
	}

}
