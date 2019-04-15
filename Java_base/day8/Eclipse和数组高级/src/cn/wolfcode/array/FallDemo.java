/*
 * 需求：
 * 在main 方法中实现如下功能并打印结果：一球从100 米高度自由落下，每次落地后
 * 反跳回原高度的一半；再落下，求它在第10 次落地时，共经过多少米？第10 次反弹多高？
 * 
 * 步骤:
 * (1)定义变量总数sum, 当前反弹高度high, 反弹次数time
 * (2)利用for循环
 * 
 * 总结:
 * (1)注意如果计算结果不为整数, 请使用double类型
 */
package cn.wolfcode.array;

public class FallDemo {
	public static void main(String[] args)
	{
		//总数
		double sum = 0;
		//反弹
		double high = 100;
		//次数
		int time = 3;
		for(int i = 1; i <= time; i++)
		{
			high = high / 2;
			sum = 100.0 + sum + high;
		}
		System.out.println("当前反弹高度: " + high);
		System.out.println("总高度: " + sum);
	}
}
