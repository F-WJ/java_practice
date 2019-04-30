/*
 需求：包装类、基本数据类型、String 三者的互换
 
 步骤:
 (1)创建一个Demo类, 使用int类型来做例子演示包装和基本数据类转换
 (2)利用Integer类的parseInt方法来把字符串装换为int类型
 
 总结:
 (1)基本类型包装类可以理解为基本类型的加强版, 内置很多方法.
*/
package cn.onedull.title03;

public class Demo {	
	public static void main(String[] args) {
		//装箱
		Integer num1 = Integer.valueOf(6); 
		System.out.println(num1);
		//拆箱
		int num2 = num1.intValue();
		System.out.println(num2);
		
		System.out.println("----------------");
		//java5自动装箱和拆箱操作
		Integer num3 = 17;
		int num4 = num3;
		System.out.println(num3 + ", " + num4);
		
		System.out.println("----------------");
		
		//字符串装int类型
		//int num5 = Integer.parseInt("123y4"); //java.lang.NumberFormatException
		Integer num5 = Integer.parseInt("123456");
		System.out.println(num5);
	}
	
}
