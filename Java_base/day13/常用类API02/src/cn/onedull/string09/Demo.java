/*
String str = "123;32;345;56;87;23;54;765;13"; 
 �ҳ� str �е����ֵ����Сֵ
 
˼·:
(1)����Arrays.sort������Stirng���split����
*/
package cn.onedull.string09;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String str = "123;32;345;56;87;23;54;765;13";
		int[] num = new int[str.split(";").length];
		for(int i = 0; i < str.split(";").length; i++) {
			num[i] = Integer.parseInt(str.split(";")[i]);
		}
		Arrays.sort(num);
		System.out.println("���ֵ: " + num[num.length -1] + " ; " + "��Сֵ: " + num[0]);
	}

}
