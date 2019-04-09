/*
6:int[] arr = {1,2,3,4,5}排序代码
思路: for for

步骤:
(1)定义一个int类型数组arr并静态初始化
(2)利用for和for嵌套组合, 外行是计算所需循环次数, 内行是判断每一个元素和其他元素大小, 如果大于, 两者对换


总结:
(1)利用for, if组合, 可以做到从元素小到大排序, 或者从大到小
*/
import java.util.Arrays;

public class ExpandDemo6
{
	public static void main(String[] args)
	{
		//定义int类型数组arr
		int[] arr = new int[]{5, 1, 3, 4, 5, 5, 9};
		int temp = 0;
		for(int time = 0; time < arr.length; time++)
		{
			for(int index = time; index < arr.length - time; index++)
			{
				if(arr[time] > arr[index])
				{
					temp = arr[time];
					arr[time] = arr[index];
					arr[index] = temp;
					
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}