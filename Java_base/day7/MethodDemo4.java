/*
需求：定义一个方法，传入一个int 数组，返回指定元素在数组中第一次出现的索引
步骤：
（1）定义方法indexSearch
（2）实现方法体(for循环遍历)
遍历数组
如果当前元素和指定元素相同，返回当前元素所在的索引
遍历所有元素后，发现找不到则返回-1，表示找不到索引
（3）调用方法

总结：
(1)通过for和if组合可以找到指定值  
*/

public class MethodDemo4
{
	static int indexSearch(int[] arr, int num)
	{
		for(int index = 0; index < arr.length; index++)
		{
			if(arr[index] == num)
			{
				return index;
			}
		}
		return -1; //-1表示当前数组没有这个值
	}

	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		//调用方法
		int index = MethodDemo4.indexSearch(arr, 2);
		System.out.println(index);
	}
}
