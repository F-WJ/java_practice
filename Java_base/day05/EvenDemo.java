/*
需求:找出[1,500]之间偶数的个数
步骤：
（1）遍历1 到500 的数
（2）判断是否是偶数，能被2 整除的就是0 数
（3）定义变量count 作为计数器，如果为偶数，count 加1.

总结:
(1)num % 2 == 0 等价于 num % 2 != 0 ,而不是num % 2 == 1, 注意负数的情况
*/
public class EvenDemo
{
	public static void main(String[] args)
	{
		//定义计数器变量
		int count = 0;
		for(int num = 1; num <= 500; num++)
		{
			if(num % 2 == 0)
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}