/*
String str = "sfsdf�㷨�� �������ķǰ����� aficionado�۰�" ͳ���ַ����� �������˼���
ʹ�� repalce�����Ƚ����
  
˼·:
(1)����if + charAt�������ж�
*/
package cn.onedull.string08;

public class Demo {

	public static void main(String[] args) {
		String str = "sfsdf�㷨�� �������ķǰ�����    aficionado�۰�";
		int sum = 0;  //����
		//for
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '��') {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
