/*
需求：定义一个方法，打印指定多少行的指定字符串
步骤：
（1）定义方法
（2）实现方法体
（3）调用方法

总结:
(1)没有返回值,方法可以使用void
*/
public class MethodDemo2
{
	static void print(int line, String str)
	{
		for(int i = 1; i <= line; i++)
		{
			System.out.println(str);
		}
	}

	public static void main(String[] args)
	{
		//调用print方法
		MethodDemo2.print(3, "你好");
	}
}