/*
需求:打印[1,500]之间是5的倍数之和

总结:
(1)for初始化的变量只能在for语句里使用
*/
public class FiveTimesDemo
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int sum = 0;
		for(int num = 1; num <= 500; num++)
		{
			if(num % 5 == 0)
			{
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}