/*
ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��ĸ���

˼·:
(1)a-z 97~122  A-Z 65~90  ASCII

�ܽ�:
(1)charAt����ֵΪchar����
*/
package cn.onedull.string06;

public class Demo {

	public static void main(String[] args) {
		String str = "aBAB";
		//��д��ĸ����
		int upnum = 0;
		//Сд��ĸ����
		int lownum = 0;
		for(int i = 0; i < str.length(); i++) {
			//Сд�ж�
			if((int)str.charAt(i) < 97) {
				//Сд
				upnum++;
			}
			else {
				//��д
				lownum++;
			}
		}
		System.out.println("Сд: " + lownum + " ; " + "��д: " + upnum);
		
	}

}
