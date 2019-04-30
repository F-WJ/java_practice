/*
需求：按照某种格式来打印出数组中的元素，打印效果为：[11,22,33,44,22,55]
步骤：
（1）定义并初始化数组nums
（2）定义一个字符串类型的变量str，用于拼接字符串
（3）遍历数组并拼接元素到str
（4）判断为最后一个元素拼接“]”，否则拼接“，”
（5）打印str

总结:
(1)二维数组静态初始化语法: 数组元素类型[][] 数组名 = new 数组元素类型[][]{数组1, 数组2, 数组3...};
*/

public class ArrayInArrayDemo
{
	public static void main(String[] args)
	{
		//定义二维数组
		int[][] arr;
		//静态初始化二维数组
		arr = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		//动态初始化二维数组
		arr = new int[3][3];
		//获取二维数组的元素
		int[] a = arr[0];
		System.out.println(a); //[I@659e0bfd
		//设置二维数组的元素
		arr[0][0] = 1;
		int b = arr[0][0];
		System.out.println(b);

		//for循环遍历
		for(int x = 0; x < arr.length; x++)
		{
			System.out.println(arr[x]);
			for(int y = 0; y < arr[x].length; y++)
			{
				System.out.println(arr[x][y]);
			}
		}
		//foreach循环遍历
		for(int[] x : arr)
		{
			for(int y : x)
			{
				System.out.println(y);
			}
		}
	}
}