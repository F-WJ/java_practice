/*
4:int[] arr1 = {1,2,3};
  int[] arr2 = {4,5,6};
  使用代码将两个数组的元素 合成一个新的数组

思路: length和for

步骤:
(1)先定义int类型数组arr1和arr2数组并静态初始化
(2)再定义int类型数组arr3并动态初始化,长度为arr1和arr2的长度
(3)利用for循环遍历,并把两个数组的元素加入arr3数组上
总结:
(1)两个数组结合的一起的时候,注意第二数组的元素加入的时候, 新数组的索引不是从0开始, 
而是从加入第一个数组最后一个索引 + 1.
*/
import java.util.Arrays;

public class ExpandDemo4
{
	public static void main(String[] args)
	{
		//定义int类型数组arr1
		int[] arr1 = new int[]{1, 2, 3};
		//定义int类型数组arr2
		int[] arr2 = new int[]{4, 5, 6};
		//定义int类型数组arr3
		int[] arr3 = new int[arr1.length + arr2.length];
		
		//for循环
		int index = 0;
		for(index = 0; index < arr1.length; index++)
		{
			arr3[index] = arr1[index];
		}
		for(int a = 0; a < arr2.length; a++)
		{
			arr3[index] = arr2[a];
			index ++;
		}

		System.out.println(Arrays.toString(arr3));
	}
}