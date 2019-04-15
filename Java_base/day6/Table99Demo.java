/*
需求:打印九九乘法表

步骤(利用嵌套循环):
(1)外for循环, 先循环1到9的数
(2)内for循环,循环是1到每一次外循环的变量的值,并外循环变量的值*内循环变量的值

总结: 在循环内, 再重复循环的情况的时候,可以利用for(){ for(){} }嵌套循环
*/

public class Table99Demo
{
	public static void main(String[] args)
	{
		//傻B方式
		System.out.println("1*1=1");
		System.out.println("1*2=2 2*2=4");
		System.out.println("1*3=3 2*3=6 3*3=9");
		System.out.print("\n" + "----------------------" + "\n");
		//普通方式
		//第一行
		int line = 1;
		for(int i = 1; i <= line; i++)
		{
			System.out.print(i + "*" + line + "=" + i * line);
		}
		System.out.println();
		//第二行
		line = 2;
		for(int i = 1; i <= line; i++)
		{
			System.out.print(i + "*" + line + "=" + i * line + " ");
		}
		System.out.println();
		//第三行
		line = 3;
		for(int i = 1; i <= line; i++)
		{
			System.out.print(i + "*" + line + "=" + i * line + " ");
		}
		System.out.print("\n" + "----------------------" + "\n");
		
		//外循环
		for(int x = 1;x <= 9; x++)
		{
			//内循环
			for(int y = 1;y <= x; y++)
			{
				System.out.print(y + "*"+ x + "=" + (x * y)+ "\t");
			}
			System.out.println();
		}
	}
}