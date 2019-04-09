/*
需求：定义求两个整数之和的方法
步骤：
（1）定义方法
确定方法名，修饰符（暂时使用static）
确定是否需要形式参数
确定是否需要返回
（2）调用方法
确定调用语法（暂时类名调用方法）
确定需要传入什么实际参数
确定是否需要定义变量接收返回值

总结:
(1)实际参数类型一定要和形参类型一致
*/
public class MethodDemo1
{
	static int getSum(int a, int b)
	{
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args)
	{
		//调用getSum方法
		int sum = MethodDemo1.getSum(2, 3);
		System.out.println(sum);
	}
}