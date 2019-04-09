/*
需求：定义一个名为combineArrays 的方法，以两个int 类型的数组arr1 和arr2 作为参数，
实现将arr1 和arr2 两个数组合并为一个新的数组，并返回合并后的新数组。
例如：arr1={1,2},arr2={3,4}，则该方法应该返回{1,2,3,4}。
思路：
（1）先求出符合要求的元素个数
（2）创建一个新的数组存放符合要求的元素
（3）将符合要求的元素存放到新的数组中

总结:
(1)合并数组的时候,注意新数组的长度是两个数组之和
*/
import java.util.Arrays;

public class CombineDemo
{
	//主方法
	public static void main(String[] args)
	{
		//定义两个数组并静态初始化
		int[] arr1 = new int[]{1, 2, 3};
		int[] arr2 = new int[]{4, 5, 6};

		//调用arrcompound方法
		String arr3 =  CombineDemo.arrcompound(arr1, arr2);
		System.out.println(arr3);
	}


	//将两个数组合并成一个数组的方法
	static String arrcompound(int[] arr1, int[] arr2)
	{
		//arr1和arr2的总长度
		int size = arr1.length + arr2.length;
		//定义一个新数组
		int[] arr3 = new int[size];
		//初始化索引
		int index = 0;

		//foreach循环遍历数组

		for(index = 0; index < arr1.length; index ++)
		{
			arr3[index] = arr1[index];
		}
		for(int index2 = 0; index2 < arr2.length; index2 ++)
		{
			arr3[index] = arr2[index2];
			index ++;
		}
		//调用将数组转换成字符串显示
		String a = CombineDemo.arrstring(arr3); 
		//返回
		return a;	
	}



	//将数组装换成字符串
	static String arrstring(int[] arr)
	{
		//定义一个String类型
		String str = "[";
		//foreach循环
		for(int index = 0; index < arr.length; index ++)
		{
			if(index != arr.length - 1)
			{
				str = str + arr[index] + ", ";
			}
			else
			{
				str = str + arr[index] + "]";
			}
		}

		//返回
		return str;
	}
}