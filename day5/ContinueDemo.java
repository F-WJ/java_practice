/*
需求:从1输出到10,不要输出4
步骤:
(1)循环遍历1到10的数
(2)判断如果i为4,跳过当前循环,否则打印

总结:
(1)continue: 表示跳过这一次循环,后面如果还是循环的话,继续循环
*/
public class ContinueDemo
{
	
	public static void main(String[] args)
	{
		for(int num = 1; num <= 10; num++)
		{
			if(num == 4)
			{
				continue;
			}
			System.out.println(num);
		}
	}
}