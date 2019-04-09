/*
需求：定义一个方法，给定三条边，判断三角形的边,如果其中两边相等返回1，如果三边相
等返回2，其他返回0.

所用到的技术: if-elseif-else语句

步骤:
(1)先在主方法定义三个int类型变量a, b, c , 作为三角形三条边
(2)在方法中设置两个条件判断, 一个是三边都相等, 一个是三边都不相等, 其他都归为只有两边相等.

总结:
(1)方法必须调用才能完成功能
*/
public class JudgeTriangleDemo
{
	//判断三角形方法
	static int trigon(int a, int b, int c)
	{
		if(a == b && a == c)
		{
			return 2;
		}
		else if(a != b && a != c && b != c)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
	//主方法
	public static void main(String[] args)
	{
		//定义三条边的数
		int a = 2;
		int b = 1;
		int c = 4;
		//调用方法
		int value = JudgeTriangleDemo.trigon(a, b, c);
		System.out.println(value);
	}


}