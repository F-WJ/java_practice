/*
需求:输出直角三角形
思路:
(1) 最简单方式:  逐行打印
(2) 使用嵌套循环

嵌套过程:
(1)外行for表示为每一行
(2)内行for表示每一行要打印的星星

总结:
(1)嵌套循环: 如果某一操作要重复执行, 如果一个重复的操作需要做N次的时候, 可以利用嵌套循环, 例如: for(){ for(){} }
*/
public class LoopInLoopDemo
{
	public static void main(String[] args)
	{
		//傻B方式
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");

		System.out.println("---------------");
		
		
		//普通方式
		//第一行
		int line = 1;
		for(int i = 1; i <= line; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		//第二行
		line = 2;
		for(int i = 1; i <= line; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		//第三行
		line = 3;
		for(int i = 1; i <= line; i++)
		{
			System.out.print("*");	
		}
		System.out.println();
		System.out.println("---------------");
		
		//利用嵌套循环
		for(int num = 1;num <= 3;num++)
		{
			for(int num2 = 1; num2 <= num;num2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}