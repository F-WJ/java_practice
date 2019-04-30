/*
需求:演示if-else if-else语句的使用
步骤:
(1)定义整数类型的两个数a和b
(2)判断a和b的大小关系

总结
(1)if-elseif-else语法:  if(boolean表达式){ 语句体 }
					    else if(boolean表达式){ 语句体 }
					    else{ 语句体 }

*/
public class IfElseIfElseDemo
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int a = 10;
		int b = 20;

		if(a > b)
		{
			System.out.println("a 大于 b");
		}
		else if(a < b)
		{
			System.out.println("a 小于 b");
		}
		else
		{
			System.out.println("a 等于 b");
		}
	}
}