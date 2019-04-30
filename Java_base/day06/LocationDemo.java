/*
需求：定义一个int 类型数组,求出该数组索引是偶数位置元素之和

步骤:
(1)定义一个int类型数组和一个总和变量sum
(2)利用for循环遍历数组
(3)利用if语句判断索引是否为偶数

总结:
(1)如果需要操作数组的索引,选用for循环
*/

public class LocationDemo
{
	public static void main(String[] args)
	{
		//定义一个int类型数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};
		//偶数总和变量
		int sum = 0;
		//利用for遍历数组
		for(int size = 0; size < arr.length; size++)
		{
			//利用if判断索引是否为偶数
			if(size % 2 == 0)
			{
				sum += arr[size];
			}
		}
		System.out.println(sum);
	}
}