/*
需求:演示比较运算符
步骤:
(1)使用> < >= <= != ==等比较运算费用操作两个整数类型的常量
(2)定义两个int类型的变量a和b
(3)使用比较运算符操作两个变量,并定义一个变量接收其运行结果

总结：
(1) 比较运算符最后结果是boolean类型
*/
public class ComparisonOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(10 > 5);
		System.out.println(10 >= 5);
		System.out.println(10 >= 10);
		System.out.println(10 < 5);
		System.out.println(10 <= 5);
		System.out.println(10 <= 10);
		System.out.println(10 == 10);
		System.out.println(10 != 10);

		//使用变量操作
		int a = 10;
		int b = 5;
		boolean result = a > b;
		System.out.println(result);
	}
}