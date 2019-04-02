/*
需求:演示do while语句的使用
步骤:
(1)使用do while循环打印500次"帅哥"
(2)使用do while循环求出100以内的正整数之和

总结:
(1)do-while: 先判断后运行循环体
*/
public class DoWhileDemo2
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int number = 1;
		
		//循环打印500次
		do
		{
			System.out.println("帅哥");
			number++;
		}
		while (number <= 500);
		
		int a = 1;
		int sum = 0;
		
		//求出100以内的正整数之和
		do
		{
			sum = sum + a;
			a++;
		}
		while(a <= 100);
		System.out.println(sum);
		
	}
}