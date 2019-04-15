/*
需求:
1:定义方法 求出 传入数组中的最大值和最小值,并返回
变量 = arr[0]

步骤:
(1)定义一个方法getValue, 参数为int类型数组
(2)通过for+if组合判断最大值和最小值
(3)返回数组
*/
public class ExpandDemo1
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		int[] a = ExpandDemo1.getValue(arr);
		System.out.println(java.util.Arrays.toString(a));
	}


	static int[] getValue(int[] arr)
	{
		int arr2[] = new int[2];
		int min = arr[0];
		int max = arr[0];
		for(int ele : arr)
		{
			if(min > ele)
			{
				min = ele;
			}
			else
			{
				max = ele;
			}
		}
		arr2[0] = min;
		arr2[1] = max;
		
		return arr2;
	}
}