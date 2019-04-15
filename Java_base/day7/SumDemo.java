/*
需求：定义一个方法getSum，接收两个int 类型的参数[min, max]，返回这个两个参数范
围之内的偶数之和。

思路: 设置一个判断两个大小方法和一个偶数之和方法  (for, 方法, if)

步骤:
(1)在主方法上定义最大值和最小值int类型变量
(2)定义一个evensum方法, 通过for循环遍历, 找出最小值到最大值范围内所有偶数, 并相加.

总结:
(1)利用for加if组合可以筛选出所要的元素.
*/

public class SumDemo
{
	//主方法
	public static void main(String[] args)
	{
		//定义最小值
		int min = 1;
		//定义最大值
		int max = 4;

		//调用方法
		int sum = SumDemo.evensum(min, max);
		System.out.println(sum);
	}


	//判断大小(防止用户输错)
	static int[] swap(int min, int max)
	{
		//新建数组
		int[] arr = new int[2];
		if(min > max)
		{
			int temp = 0;
			temp = min;
			min = max;
			max = temp;
		}
		//设置值
		arr[0] = min;
		arr[1] = max;
		//返回
		return arr;
	}

	//求偶数之和方法
	static int evensum(int min, int max)
	{
		//初始化总和变量
		int sum = 0;
		//调用判断两个数大小方法
		int[] arr = SumDemo.swap(min, max);
		//所有偶数之和
		for(int count = arr[0]; count <= arr[1]; count++)
		{
			//判断是否为偶数
			if(count % 2 == 0)
			{
				sum = sum + count;
			}
		}
		//返回总和
		return sum;
	}		
}