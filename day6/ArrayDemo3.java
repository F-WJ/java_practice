/*
需求：数组的基本操作
步骤：
（1）定义一个数组nums,并静态初始化该数组
（2）定义一个变量size 获取nums 的数组长度
（3）获取数组元素
（4）设置数组元素
（5）遍历数组

总结:
(1)注意数组一旦初始化成功, 数组的长度是固定的,除非重新再初始化.
*/

public class ArrayDemo3
{
	public static void main(String[] args)
	{
		//定义数组,并静态初始化
		int[] nums = new int[]{1, 2, 3, 4};
		//获取nums的数组长度
		int size = nums.length;
		//获取数组元素
		int num = nums[0];
		System.out.println(num);
		//设置数组元素
		nums[0] = 5;
		System.out.println(nums[0]);
		//遍历数组
		for(int a = 0; a < nums.length; a++)
		{
			System.out.println(nums[a]);
		}
		
	}
}