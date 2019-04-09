/*
3:int[] arr = {1,2,3,4,5,5,5,1,10} 
		输出 arr 中每个数出现的次数
			1 出现了 2次
			2 出现了 1次
			3 出现了 1次
			..

思路: foreach 新建一个数组(存放已经检测过的元素, 通过if来判断是否存在)

步骤:
(1)先定义一个int类型数组arr并静态初始化和一个临时数组temp(表示已经检测过的元素)
(2)再定义一个变量x(和if组合来判断元素是否已经在前面总计过了)和总次数sum
(3)利用for + if组合来统计元素出现次数和判断元素是否已经检测过.


总结:
(1)通过一个变量, if和数组组合可以做成数组的某一元素是否已经使用过的功能.
*/

import java.util.Arrays;

public class ExpandDemo3
{
	public static void main(String[] args)
	{
		//定义一个int类型数组
		int[] arr = new int[]{1, 1, 3, 4, 5, 5, 6, 7, 8};
		//临时数组(表示已经检测过的元素)
		int[] temp = new int[arr.length];
		//出现次数
		int sum = 0;
		//判断是否在临时数组temp有相等元素(0代表有)
		int x = 0;
		//for循环遍历arr
		for(int index = 0; index < arr.length; index++)
		{	
			
			//判断arr所有元素的值是否等于当前arr
			for(int a = 0; a < arr.length; a++)
			{
				if(arr[index] == arr[a])
				{
					sum = sum + 1;
				}
			}
			//把arr[index]存放到temp数组上
			for(int ele : temp)
			{
				//如果有元素相等,不打印次数
				if(ele == arr[index])
				{
					x = 1;
					break; //跳出循环
				}
			}
			if(x == 0)
			{
				System.out.println(arr[index] + " 出现了 "+ sum + " 次");
				temp[index] = arr[index];
			}
			
			//初始化操作
			x = 0;
			sum = 0;		
		}
		System.out.println(Arrays.toString(temp));
	}
}