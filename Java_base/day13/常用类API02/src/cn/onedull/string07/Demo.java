/*
String str = "1233343467768987923477";将字符串中所有偶数数字找出,求出他们的总和

思路:
(1)char 0~9 48~57 ascii  

总结:
(1)注意char类型转int类型后的值
*/
package cn.onedull.string07;

public class Demo {

	public static void main(String[] args) {
		String str = "1233343467768987923477";
		int evensum = 0;  //偶数和
		//for
		for(int i = 0; i < str.length(); i++) {
			if((int)str.charAt(i) % 2 == 0) {
				evensum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		//打印
		System.out.println(evensum);
		
	}

}
