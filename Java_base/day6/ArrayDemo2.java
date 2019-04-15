/*
需求：数组的动态初始化和内存分析
步骤：
（1）动态初始化数组，并打印数组长度
（2）重新初始化数组，并打印数组长度
（3）请在纸上画出以上代码的内存分析图

总结:
(1)动态初始化语法: 数组元素类型[] 数组名 = new 数组元素类型[length], length为数组长度
*/

public class ArrayDemo2
{
	public static void main(String[] args)
	{
		//动态初始化数组
		int[] arr = new int[4];
		//打印数组长度
		int size = arr.length;
		System.out.println(size);
		//重新初始化
		arr = new int[3];
		//打印数组长度
		size = arr.length;
		System.out.println(size);

	}
}