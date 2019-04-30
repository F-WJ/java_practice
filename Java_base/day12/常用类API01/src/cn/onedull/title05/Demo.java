/*
需求：
演示String 类创建对象的两种方式，并使用== 和equals 方法进行比较
判断字符串非空

步骤:
(1)创建一个Demo类, 创建String类
(2)利用if语句判断字符串是否非空

总结:
(1)字符串是可变的, 每一次重新赋值,地址值都会变动.
(2)判断两个字符串使用equals, 不要使用==, ==判断是内存地址是否相同.
*/
package cn.onedull.title05;

public class Demo {

	public static void main(String[] args) {
		//创建字符串(第一种方式)
		String str1 = "123";
		//第二种方式
		String str2 = new String("123");
		
		//==和equals方法对比两个字符串
		boolean b1 = str1 == str2;  // false
		System.out.println(b1);
		boolean b2 = str1.equals(str2);  //true
		System.out.println(b2);
		
		boolean b3 = str1 == null && "".equals(str1.trim()); 
		System.out.println(b3); //false
	}

}
