/*
需求：按照某种格式来打印出数组中的元素，打印效果为：[11,22,33,44,22,55]
步骤：
（1）定义并初始化数组nums
（2）定义一个字符串类型的变量str，用于拼接字符串
（3）遍历数组并拼接元素到str
（4）判断为最后一个元素拼接“]”，否则拼接“，”
（5）打印str

总结:
(1)如果需要操作数数组的索引,选用for
*/

public class ArrayDemo6
{
	public static void main(String[] args)
	{
		//定义数组并初始化
		int[] nums = new int[]{11, 22, 33, 44, 22, 55};
		//定义一个String类型变量
		String str = "[";

		//利用for遍历数组
		for(int size = 0; size < nums.length; size++)
		{
			if(size == nums.length - 1)
			{
				str = str + nums[size] + "]";
			}
			else
			{
				str = str + nums[size] + ", ";
			}
		}
		System.out.println(str);
	}
}