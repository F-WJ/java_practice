/*
需求：定义一个方法接收一个int 类型的二维数组，返回所有元素平均值(int 类型)。
思路：{{0,1,2}，{3,4}} 结果（0+1+2+3+4）/5 = 2
主要使用到的方法:  二维数组, foreach循环,

步骤:
(1)先在主方法上定义一个int类型二维数组并静态初始化
(2)通过for+for组合,嵌套循环,来得到所有元素, 并相加
(3)最后把总数除以所有元素总和, 并返回平均值

总结:
(1)注意方法使用二维数组作为参数的时候, 两个[][]
*/
public class AvgDemo
{
	//主方法
	public static void main(String[] args)
	{
		//定义一个二维数组并静态初始化
		int[][] arr = new int[][]{{0, 1, 2}, {3, 4}};
		//调用方法
		int average = AvgDemo.averagevalue(arr);
		System.out.println(average);
	}

	//返回数组所有平均值(int类型)方法
	static int averagevalue(int[][] arr)
	{
		//初始化总数和次数
		int sum = 0;
		int time = 0;
		
		for(int[] ele1 : arr)
		{
			for(int ele2 : ele1)
			{
				sum = sum + ele2;
				time ++;
			}
		}
		//总数平均值
		return sum / time;
	}
}