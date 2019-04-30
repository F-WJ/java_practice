/*
String str = "123;32;345;56;87;23;54;765;13"; 
 找出 str 中的最大值和最小值
 
思路:
(1)利用Arrays.sort方法和Stirng类的split方法
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
		System.out.println("最大值: " + num[num.length -1] + " ; " + "最小值: " + num[0]);
	}

}
