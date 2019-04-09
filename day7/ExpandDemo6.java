/*
需求:
定义方法,筛选出两个数组中所有的奇数,保存在新的数组中并且返回新的数组.

步骤:
(1)
*/
public class ExpandDemo6
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[]{1, 2, 3};
		int[] arr2 = new int[]{4, 5, 6};
		int[] arr3 = ExpandDemo6.getOdd(arr1, arr2);
		System.out.println(java.util.Arrays.toString(arr3));
	}

	static int[] getOdd(int[] arr1, int[] arr2)
	{
		//求新数组长度
		int num = 0;
		for(int ele : arr1)
		{
			if(ele % 2 != 0)
			{
				num++;
			}
		}
		for(int ele :arr2)
		{
			if(ele % 2 != 0)
			{
				num++;
			}
		}
		int[] arr3 = new int[num];
		
		//存放所有奇数到新数组上
		int index = 0;
		for(int ele : arr1)
		{
			if(ele % 2 != 0)
			{
				arr3[index] = ele;
				index++;
			}
		}
		for(int ele :arr2)
		{
			if(ele % 2 != 0)
			{
				arr3[index] = ele;
				index++;
			}
		}

		return arr3;

	}
}