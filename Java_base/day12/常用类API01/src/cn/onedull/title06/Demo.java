/*
需求：演示String 中的常用方法的调用（9 个 )

步骤:
(1)调用测试类Demo, 创建一个String类, 调用常用的9个方法

总结:
(1)使用substring注意, 最后参数的索引值是不包括要提取索引的范围内
*/
package cn.onedull.title06;

public class Demo {

	public static void main(String[] args) {
		String str1 = "ABCDEFG";
		String str2 = "ABCDEFG";
		//字符串长度
		int size = str1.length();
		System.out.println(size);
		//通过索引查找某一值
		char num = str1.charAt(0);
		System.out.println(num);
		//利用equals判断两个字符串的值是否相等
		boolean b1 = str1.equals(str2);
		System.out.println(b1); //true
		//从某一索引开始, 直到最后索引结束, 切片
		String str3 = str1.substring(1);
		System.out.println(str3);
		//从某一索引开始, 直到某一索引结束, 切片
		String str4 = str1.substring(5, 6);
		System.out.println(str4);
	}

}
