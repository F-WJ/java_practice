/*
需求:演示if语句的使用
步骤:
(1)定义一个整数类型的变量a
(2)判断a大于5,大于打印"a大于5"
(3)判断a大于20,大于打印"adayu20"

总结：
(1)if语法: if(boolean表达式){ 语句体 }
*/
public class IfDemo1
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int a = 10;
		if(a > 5)
		{
			System.out.println("a大于5");
		}
		if(a > 20)
		{
			System.out.println("a大于20");
		}
	}
}