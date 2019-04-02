/*
需求:打印[1,100]正方形数,比如1,4,9....

利用for循环

总结:
(1)for的变量只能在for语句内使用
*/
public class SquareNumberDemo
{
	public static void main(String[] args)
	{
		for(int num = 1; num <= 100; num++)
		{
			if(num*num <= 100)
			{
				System.out.println(num*num);
			}
		}
	}
}