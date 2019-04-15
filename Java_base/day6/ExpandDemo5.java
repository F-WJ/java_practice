/*
5:int[] arr = {1,2,3,4,5}
  将arr 中的数据进行反转, 变成 {5,4,3,2,1}

思路: 运用length和for

步骤:
(1)先定义一个int类型数组arr并静态初始化
(2)再定义一个int类型新数组arr2并动态初始化,长度为arr的长度
(3)利用for循环.

总结:
(1)通过for循环, 从最大索引开始遍历, 可以把元素反转.
*/
import java.util.Arrays;

public class ExpandDemo5
{
	public static void main(String[] args)
	{
		//定义int类型数组arr
		int[] arr = new int[]{1, 2, 3, 4, 5};
		//定义新数组arr2
		int[] arr2 = new int[arr.length];
		//for
		for(int index = arr.length - 1; index >= 0; index--)
		{
			arr2[index] = arr[(arr.length - 1) - index];
		}
		arr = arr2;

		System.out.println(Arrays.toString(arr));
	}
}