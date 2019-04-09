/*
需求：演示基本数据类型值传递机制和引用数据类型值传递机制的区别
步骤：
（1）基本数据类型的值传递机制
定义一个方法，改变一个基本类型变量的值
（2）引用数据类型值传递机制
定义一个方法，改变一个数组中的一个元素的值
（3）调用方法，并观察值之间的区别
（4）请画出基本类型值传递的内存分析图
（5）请画出引用类型值传递的内存分析图

总结:
(1)方法参数的值传递机制为: 当是基本类型参数时, 传递的是参数值, 当是引用类型参数时.
	传递的是所引用的堆空间地址值.
*/
public class MethodParamDemo
{
	static void change(int x)
	{
		x = 100;
	}

	static void change(int[] arr2)
	{
		arr2[0] = 30;	
	}

	public static void main(String[] args)
	{
		//基本类型参数
		int a = 10;
		System.out.println("before: " + a);
		//调用方法
		MethodParamDemo.change(a);
		System.out.println("end: " + a);

		//引用类型参数
		int[] arr1 = new int[]{10, 90};
		System.out.println("before: " + arr1[0]);
		//调用方法
		MethodParamDemo.change(arr1);
		System.out.println("end: " + arr1[0]);

	}
}