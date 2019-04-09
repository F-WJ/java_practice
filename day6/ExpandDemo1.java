/*
1:数组 int[] arr = {1,2,3,4,5};
	求出 arr 中所有元素之和
	求出 arr 中所有的偶数元素之和
	求出 arr 中元素中 个位包含 3 的元素之和
	判断 arr 中是否存在 10,若存在输出,10所在的索引, 如不存在输出"不存在"
思路: foreach if 

步骤:
(1)定义一个int类型数组arr并静态初始化
(2)定义总数(sum), 偶数元素总和(evensum), 个位数为3的总和(threesum)变量
(3)利用for-each和if组合来求偶数之和, 个位数为3的元素的总和

总结:
(1)利用for-each和if组合可以筛选出个人所需元素
*/
public class ExpandDemo1
{
	public static void main(String[] args)
	{
		//定义int类型数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 10};
		//定义总数和sum变量
		int sum = 0;
		//定义偶数元素之和
		int evensum = 0;
		//定义个位数包含3的元素之和
		int threesum = 0;
		//利用for-each循环(所有元素之和)
		for(int a : arr)
		{
			sum = sum + a;
		}
		System.out.println(sum);

		//利用for-each循环和if判断(所有偶数元素之和)
		for(int a : arr)
		{
			if(a % 2 == 0)
			{
				evensum = evensum + a;
			}
		}
		System.out.println(evensum);

		//利用for-each循环和if判断(所有元素个位包含3的元素之和)
		for(int a : arr)
		{
			//个位数
			if(a % 3 == 0)
			{	
				threesum = threesum + a;
			}
		}
		System.out.println(threesum);

		//利用for循环和if判断(判断如果元素为10, 就输出当前索引)
		int y = 1;
		for(int size = 0; size < arr.length; size++)
		{
			
			if(arr[size] == 10)
			{
				System.out.println("元素为10的索引: " + size);
				y = 0;
			}
		}
		//判断y是否为1
		if(y == 1)
		{	
			System.out.println("不存在");
		}
		
	}
}