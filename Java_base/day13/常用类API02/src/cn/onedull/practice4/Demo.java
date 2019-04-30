/*
String[] strs = {"2+3+4","2+4","5+6","9+7"};
1）请把strs 中的所有数字加起来；
2）请求出所有数字的平均数

步骤:
(1)定义一个String类并赋值, 定义变量sum(和)和time(循环次数)
(2)利用String类的split方法, 筛选指定值, 并通过for求和

总结:
(1)注意使用split方法的时候, +的时候要用//, 取消转移形式
*/
package cn.onedull.practice4;

public class Demo {

	public static void main(String[] args) {
		//创建String  
		String[] strs = {"2+3+4","2+4","5+6","9+7"};
		int sum = 0;  //和
		int time = 0; //循环次数
		for(String ele : strs) {
			String[] str = ele.split("\\+");
			for(String ele2 : str) {
				sum = sum + Integer.parseInt(ele2);
				time++;
			}
		}
		int average = sum / time; 
		System.out.println(sum + " " + average);
	}

}
