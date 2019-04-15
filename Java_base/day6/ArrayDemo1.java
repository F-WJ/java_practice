/*
需求：定义数组和数组的静态初始化操作
步骤：
（1）先定义后初始化数组（不能使用简写方式）
（2）定义数组，同时初始化
（3）打印数组长度
（4）数组赋值为空，并演示空指针错误
（5）请在纸上画出以上代码的内存分析图

总结:
(1)数组定义语法: 数据元素类型[] 数组名;
(2)静态初始化语法: 数组元素类型[] 数组名 = new 数组元素类型[]{元素1, 元素2,....}
*/
public class ArrayDemo1
{
	public static void main(String[] args)
	{
		//先定义后初始化
		int[] arr1;
		arr1 = new int[]{1, 2, 3, 4};
		//定义数组同时初始化
		int[] arr2 = new int[]{1, 2, 3};
		//打印数组长度
		int size = arr2.length;
		System.out.println(size);
		//当数组赋值为空
		arr2 = null;
		System.out.println(arr2[0]); //NullPointerException空指针错误
		
	}
}