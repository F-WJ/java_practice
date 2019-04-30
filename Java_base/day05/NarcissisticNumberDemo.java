/*
需求:打印所有的水仙花数,所谓水仙花数是指一个三位数[100,999],
其各位数字的立方之和等于该数本身.

分析需求
(1)拆解三位数,百位,十位,个位
(2)if判断

总结:
(1)可以通过除法和余数,来分拆数字
*/
public class NarcissisticNumberDemo
{
	public static void main(String[] args)
	{
		for(int num = 100; num <= 999; num++)
		{
			//百位
			int a = num / 100;
			//十位
			int b = num % 100 / 10;
			//个位
			int c = num % 100 % 10;
			if(num == (a*a*a + b*b*b + c*c*c))
			{
				//System.out.println(a + "," + b + "," + c);
				System.out.println(num);
			}
		}
	}
}