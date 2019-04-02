/*
需求:从1输出到10,当迭代变量为7,就终止程序
步骤:
(1)循环打印1到10
(2)判断循环次数是否为7,是就终止程序,否则打印循环次数

总结:
(1)return: 表示结束程序
*/
public class ReturnDemo
{
	public static void main(String[] args)
	{
		for(int num = 1; num <= 10; num++)
		{
			if(num == 7)
			{
				return;
			}
			System.out.println(num);
		}
		System.out.println("ending.....");
	}
}