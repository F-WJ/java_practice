/*
1.实现功能对指定的敏感词汇进行过滤替换，把敏感词过滤成*号输出
如原句：“窝草，昨晚又停电了！”
过滤后为：“**，昨晚又停电了！”
分析：
1，需要存储多个指定的敏感单词；
2，针对所有的敏感字都需要判断及过滤；
3，敏感字替换；
4，替换的*字符和原字符长度相同；

步骤:
(1)创建Demo类, 创建字符串, 利用replace方法来屏蔽某些信息.
(2)使用for语句统计星星总数.

总结:
(1)使用string类的replace方法来修改某些字符
*/
package cn.onedull.practice1;

public class Demo {
	public static void main(String[] args) {
		//原话
		String str1 = "扑街，昨晚又停电了！";
		//屏蔽信息
		String str2 = "扑街";
		//屏蔽信息的长度
		int num = str2.length();
		//计算*的数量
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= num; i++) {
			s.append("*"); 
		}
		String star = s.toString();
		String str3 = str1.replace(str2, star);
		System.out.println(str3);
		
		
	}
}
