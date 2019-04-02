/*
需求:使用while循环,打印10次帅哥
步骤:
(1)定义一个变量count,表示计数器
(2)使用while循环,判断count是否小于10
(3)打印"帅哥"和循环次数
(4)计数器+1

总结:
(1)while语法: while(boolean表达式){ 循环体 }
*/
public class WhileDemo
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int count = 0;

		while(count < 10)
		{
			System.out.println("帅哥");
			count += 1;
		}
	}
}