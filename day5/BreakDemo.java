/*
需求:从1输出到10, 当迭代变量为7,就停止循环
步骤:
(1)循环打印1到10
(2)判断循环次数是否为7,是就停止循环,否则打印循环次数

总结:
(1)break:表示停止当前所在循环
*/
public class BreakDemo
{
	public static void main(String[] args)
	{
		for(int num=1; num <= 10; num++)
		{
			if(num == 7)
			{
				break;
			}
			System.out.println(num);
		}
		System.out.println("ending....");
	}
}