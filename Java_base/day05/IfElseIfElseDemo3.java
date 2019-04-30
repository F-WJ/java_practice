/*
需求:根据qq在线的天数判断qq的等级
步骤:
(1)定义一个变量days,表示天数
(2)判断天数范围

总结:
(1)当boolean表达式要表达两种条件都true的时候,可以使用&&
*/
public class IfElseIfElseDemo3
{
	public static void main(String[] args)
	{
		int day = 22;
		if(day >=0 && day < 5)
		{
			System.out.println("没有登记");
		}
		else if(day >= 5 && day < 12)
		{
			System.out.println("☆");
		}
		else if(day >= 12 && day < 21)
		{
			System.out.println("☆☆");
		}
		else if(day >= 21 && day < 32)
		{
			System.out.println("☆☆☆");
		}
		else
		{
			System.out.println("终于有月亮了");
		}

	}
}
