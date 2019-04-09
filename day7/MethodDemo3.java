/*
需求：定义一个方法，传入一个int 数组，按照格式打印int 类型数组
步骤：
（1）定义方法
（2）实现方法体
（3）调用方法
*/
public class MethodDemo3
{
	static String print(int[] arr)
	{
		String str = "[";
		//for循环
		for(int index = 0; index < arr.length; index++)
		{
			if(index == arr.length - 1)
			{
				str = str + arr[index] + "]";
			}
			else
			{
				str = str + arr[index] + ", ";
			}
		}
		//返回str值
		return str;
	}

	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		String a = MethodDemo3.print(arr);
		System.out.println(a);

	}
}