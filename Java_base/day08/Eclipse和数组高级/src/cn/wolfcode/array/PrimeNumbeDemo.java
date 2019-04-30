/*
 * 需求：请输出1-100 以内最大的五个质数(质数又称素数。一个大于1 的自然数，如果除了1
 * 和它自身外，不能被其他自然数整除的数)。
 * 思路：
 *（1）一个数num 和[2，num)这个范围的数进行对比，如果能被整除就不需要进行对比
 *（2）5 个数，那么需要我们定义一个计数器，来记录符合要求的个数
 *（3）最大的需要我们倒着循环
 *
 *总结:
 *(1)当设置某一个if开关的时候, 注意初始化步骤
 */
package cn.wolfcode.array;

public class PrimeNumbeDemo {
	public static void main(String[] args)
	{
		int count = 0;
		//
		int temp = 0;
		for(int num = 100; num > 1; num--)
		{
			//判断是否为质数
			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					temp = 1;
					break;
				}
			}
			if(temp == 0)
			{
				System.out.println(num);
				count++;
			}
			if(count == 5)
			{
				break;
			}
			//初始化
			temp = 0;
			
		}
	}
	
}
