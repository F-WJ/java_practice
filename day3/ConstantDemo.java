//需要:演示不同数据类型的常量
/*
步骤:
(1)打印整数类型(byte, short, int, long)常量
(2)打印小数类型(float, double)常量
(3)打印boolearn类型常量
(4)打印char类型常量
(5)打印引用类型String的常量
*/

/*
总结:
1. float类型常量记得后面添加 F, long类型常量记得后面添加 L
2. String类型属于引用数据类型
*/


//创建一个类名为ConstantDemo
public class ConstantDemo
{
	//创建主方法(程序入口)
	public static void main(String[] args)
	{

		//整数类型
		//byte类型
		System.out.println(127);
		//short类型
		System.out.println(20);
		//int类型
		System.out.println(20);
		//long类型
		System.out.println(20L);

		//小数类型
		//float类型
		System.out.println(3.14F);
		//double类型
		System.out.println(3.14);
	

		//字符类型
		//char类型
		System.out.println("A");
		System.out.println(65);

		//布尔类型
		//boolean类型
		System.out.println(true);
		System.out.println(false);

		//引用数据类型
		//String类型
		System.out.println("你好");
		

	}
}
