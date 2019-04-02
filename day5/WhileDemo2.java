/*
需求:打印从1到100的数
步骤:
(1)定义一个变量number
(2)循环打印number并number的值加1

总结:
(1)while语句先判断后运行循环体
*/
public class WhileDemo2
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int number = 1;

		while(number <= 100)
		{
			System.out.println(number);
			number++;
		}
	}
}