/*
需求:演示while和do-while的区别
步骤:
(1)定义两个整数变量a和b
(2)分别使用while和do while判断 a > b

注意:出来结果while没有打印任何内容,do while打印了一次"a > b", 才算作业完成

总结:
(1)while和do-while的区别在于, while先判断后运行循环体, do-while相反
*/
public class DoWhileDemo1
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int a = 10;
		int b = 20;
		
		//while语句
		while(a > b)
		{
			System.out.println("a > b");
		}
		
		System.out.println("--------------");
		
		//do-while语句
		do
		{
			System.out.println("a > b"); //先运行循环体
		}
		while (a > b);
	}
}