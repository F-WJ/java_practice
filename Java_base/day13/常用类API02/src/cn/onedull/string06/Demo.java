/*
统计一个字符串中大写字母字符，小写字母字符的个数

思路:
(1)a-z 97~122  A-Z 65~90  ASCII

总结:
(1)charAt返回值为char类型
*/
package cn.onedull.string06;

public class Demo {

	public static void main(String[] args) {
		String str = "aBAB";
		//大写字母总数
		int upnum = 0;
		//小写字母总数
		int lownum = 0;
		for(int i = 0; i < str.length(); i++) {
			//小写判断
			if((int)str.charAt(i) < 97) {
				//小写
				upnum++;
			}
			else {
				//大写
				lownum++;
			}
		}
		System.out.println("小写: " + lownum + " ; " + "大写: " + upnum);
		
	}

}
