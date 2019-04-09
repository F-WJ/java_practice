/*
需求：求出int 类型数组中最大元素值
步骤：
（1）定义并初始化数组nums
（2）定义一个变量max 表示最大的元素，并假设nums 的第一个元素为最大值
（3）使用foreach 循环遍历nums 数组
（4）判断如果遍历的元素和max 比较，遍历的元素比较大，就将当前元素赋值给max
（5）遍历完成打印max

总结:
(1)如果仅仅需要操作元素,可以使用foreach来遍历数组
*/
public class ArrayDemo5
{
	public static void main(String[] args)
	{
		//定义并初始化数组nums
		int[] nums = new int[]{1, 22, 343, 33, 2132, 323};
		//定义一个int类型变量max(表示假设最大值)
		int max = nums[0];
		//通过foreach循环来遍历所有元素
		for(int a : nums)
		{
			//判断当前元素是否大于max,如果大于, 把a元素赋值给max
			if(a > max)
			{
				max = a;
			}
		}
		System.out.println(max);
	}
}