/*
String str = "1233343467768987923477";���ַ���������ż�������ҳ�,������ǵ��ܺ�

˼·:
(1)char 0~9 48~57 ascii  

�ܽ�:
(1)ע��char����תint���ͺ��ֵ
*/
package cn.onedull.string07;

public class Demo {

	public static void main(String[] args) {
		String str = "1233343467768987923477";
		int evensum = 0;  //ż����
		//for
		for(int i = 0; i < str.length(); i++) {
			if((int)str.charAt(i) % 2 == 0) {
				evensum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		//��ӡ
		System.out.println(evensum);
		
	}

}
