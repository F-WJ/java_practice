/*
需求：定义一个元素为String 类型数组，按照格式逆序打印该数组的元素，例如
数组内容为：{“A”，”B”，”C”，”D”},打印效果为：[D,C,B,A]
思路：
（1）新建一个数组(大小为源数组元素总数)
（2）利用for( : ){}打印所有元素,之后代入新数组

总结:
(1)数组最大索引可以通过数组名.length - 1来获得
*/
public class ReversedDemo
{
	public static void main(String[] args)
	{
		//定义一个int类型数组
		String[] arr = new String[]{"A", "B", "C", "D"};
		//arr数组的长度
		int num = arr.length;
		//
		String str = "[";
		//利用for循环
		for(int size = num - 1; size >= 0; size--)
		{
			//System.out.println(arr[size]
			if(size == 0)
			{
				str = str + arr[size] + "]";
			}
			else
			{
				str = str + arr[size] + ", ";
			}
		}
		System.out.println(str);

	}
}