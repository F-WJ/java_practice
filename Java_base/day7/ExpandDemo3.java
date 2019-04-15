/*
需求:
定义方法 求出 传入数 的位数:
传入 10  返回 2位数
传入 4321  返回 4位数

步骤:
(1)
*/

public class ExpandDemo3
{
	public static void main(String[] args)
	{
		int a = 100;
		int num = ExpandDemo3.getNum(a);
		System.out.println(num);
	}


	static int getNum(int a)
	{
		int count = 0;
		int num = 10;
		while(true)
		{
			a = a / num;
			if(a == 0)
			{
				count++;
				break;
			}
			else
			{
				count++;
			}
		}

		return count;
		
	}
}