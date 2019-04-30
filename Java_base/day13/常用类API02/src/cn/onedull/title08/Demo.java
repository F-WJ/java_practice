/*
需求：
判断一个字符串是否全部有数字组成
判断一个字符串是否是手机号码
判断一个字符串是否是18 位身份证号码
判断一个字符串是否6 到16 位，且第一个字必须为字母

步骤:
(1)先创建一个字符串, 存放要匹配的规则
(2)调用字符串的matches方法, 进行匹配.

总结:
(1)注意转义
*/
package cn.onedull.title08;

public class Demo {

	public static void main(String[] args) {
		//判断一个字符是否全部由数字组成
		System.out.println("12345678".matches("\\d*"));  //true
		System.out.println("123456wew8".matches("\\d*"));  //false
		
		//判断一个字符串是否有手机号码
		String re = "1[3|4|5|7|8|9][0-9]{9}$";
		System.out.println("12728345676".matches(re));  //false
		System.out.println("13545676545".matches(re));  //true
		
		//判断一个字符串是否18位身份证号码
		String re2 = "\\d{17}[[0-9]X]";
		System.out.println("234565432345676522".matches(re2));  //true
		System.out.println("22223124553453453X".matches(re2));  //true
		System.out.println("22223124553453453A".matches(re2));  //false
		
		//判断一个字符串是否6到16位, 而且第一个子必须为字母
		String re3 = "^[a-zA-z]\\w{5,15}$";
		System.out.println("fwj12112".matches(re3));   //true
		System.out.println("12112".matches(re3));   //false
	}

}
