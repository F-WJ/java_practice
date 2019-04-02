/*
需求:演示for语句的使用
步骤:
(1)使用for循环打印1到10
(2)使用for循环计算100以内正整数之和

总结:
(1)for语法: for(初始化语句;boolean表达式;循环后操作语句){ 循环体 }
(2)for里定义的变量只能在for里面使用
*/
public class ForDemo
{
	public static void main(String[] args)
	{
		//循环打印1到10
		for(int num = 1; num <= 10; num++)
		{
			System.out.println(num);
		}

		System.out.println("---------------------------");
		
		//利用for循环计算100以内正整数之和
		int sum = 1;
		for(int num = 1;num <= 100;num++)
		{
			sum = num + sum;
		}
		System.out.println(sum);
	}
}