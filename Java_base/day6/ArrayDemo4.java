/*
需求：找出数组值元素22,在数组中第一次出现的索引位置
步骤：
（1）定义一个数组nums，并初始化该数组
（2）定义一个变量key，表示被搜索的元素
（3）遍历数组
（4）判断如果当前元素和key 相等，证明找到元素，打印并结束循环

总结:
(1)可以通过for循环来获取数组每一个元素和对应的索引
*/

public class ArrayDemo4
{
	public static void main(String[] args)
	{
		//定义并初始化数组
		int[] nums = new int[]{1, 2, 33, 22, 55};
		//定义int类型变量(表示要搜索的元素)
		int key = 22;
		//利用for遍历数组
		for(int size = 0; size < nums.length; size++)
		{
			//判断数组元素是否等于key值
			if(nums[size] == key)
			{
				System.out.println(size);
			}
		}
	}
}