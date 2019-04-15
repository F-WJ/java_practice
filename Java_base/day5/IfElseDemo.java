/*
需求:演示if-else语句的使用
步骤:
(1)定义一个整数类型的变量a
(2)判断a是奇数还是偶数,如果是偶数打印"a是偶数",否则打印"a是奇数"

总结:
(1)if-else语法: if(boolean表达式){ 语句体 } else{ 语句体 }
(2)注意: a%2==0, 等价于a%2 != 0, 不是a%2 == 1, 因为要考虑负数的情况
*/
public class IfElseDemo
{
	public static void main(String[] args)
	{
		//定义int类型变量并赋值
		int a = 10;
		if(a % 2 == 0)
		{
			System.out.println("a是偶数");
		}
		else
		{
			System.out.println("a是奇数");
		}
	}
}