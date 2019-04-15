/*
需求:
定义方法 求出传入数组中,所有偶数数据的累加和
if(ele % 2 == 0)

步骤:
(1)定义getEven方法, 参数为int类型数组, 返回int值
(2)通过for+if组合判断元素是否偶数.
*/
public class ExpandDemo2
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		int evenSum = ExpandDemo2.getEven(arr);
		System.out.println(evenSum);
	}

	static int getEven(int[] arr)
	{
		int sum = 0;
		for(int ele : arr)
		{
			if(ele % 2 == 0)
			{
				sum = sum + ele;
			}
		}
		return sum;
	}
}