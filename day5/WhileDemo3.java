/*
需求:计算 100以内的正整数和
步骤:
(1)定义一个变量number,表示加数
(2)定义一个变量sum,表示前N个数之和
(3)使用while循环,每循环一次sum和当前的number相加一次

总结:
(1)while语句当boolean表达式为true是,循环体才运行
*/
public class WhileDemo3
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int number = 1;
		int sum = 0;

		while(number <= 100)
		{
			sum = sum + number;
			number++;
		}
		System.out.println(sum);
	}
}