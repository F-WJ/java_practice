/*
需求：定义一个int 类型的数组，返回一个长度为2 数组，其索引0 位置存放参数数组
偶数索引元素之和，索引1 位置存放参数数组奇数索引元素之和。
思路：
(1)新建数组
(2)利用for循环, if语句判断是否为偶数, 如果是相加

总结:
(1)利用数组名.length获取数组长度
(2)利用for循环遍历数组所有元素

总结:
(1)注意for循环的时候, 数组的长度和索引最大值是不一样的
*/
public class StatisticsDemo1
{
	public static void main(String[] args)
	{
		//定义int类型数组
		int[] arr1 = new int[2];
		//源数组
		int[] arr2 = new int[]{10, 20, 30, 40};
		//偶数总和
		int sum1 = 0;
		//奇数总和
		int sum2 = 0;

		//for循环遍历数组
		for(int size = 0; size < arr2.length; size++)
		{
			//判断是否是偶数索引
			if(size % 2 == 0)
			{
				sum1 = sum1 + arr2[size];
			}
			else
			{
				sum2 = sum2 + arr2[size];
			}
		}
		System.out.println(sum1 + ", " + sum2);
		//设置元素值
		arr1[0] = sum1;
		arr1[1] = sum2;
		
	}
}