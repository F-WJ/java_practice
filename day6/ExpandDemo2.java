/*
2:数组int[] arr = {1,-2,-3,4,9},找出arr中所有的正数,保存在新的数组newArr中
思路: foreach if

步骤:
(1)定义一个int类型数组arr并静态初始化
(2)再定义一个int类型数组newarr并动态初始化, 长度为arr元素的正数总和
(3)利用for-each和if组合找出arr所有正数, 并保存到newarr中

总结:
(1)for-each和if的组合, 在不需要使用索引值的时候, 筛选某种元素的时候,代码更加简洁.
*/

//包
import java.util.Arrays;

public class ExpandDemo2
{
	public static void main(String[] args)
	{
		//定义int类型数组
		int[] arr = new int[]{1, -2, -3, 4, 9};

		//找出arr所有正数
		int sum = 0;
		for(int ele : arr)
		{
			if(ele > 0)
			{
				sum ++;
			}
		}

		//定义新数组
		int[] newarr = new int[sum];

		//定义一个索引
		int index = 0;
		//利用for循环
		for(int ele : arr)
		{
			if(ele > 0)
			{
				newarr[index] = ele;
				index ++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
		//for(int ele : newarr)
		//{
		//	System.out.println(ele);
		//}
	}
}