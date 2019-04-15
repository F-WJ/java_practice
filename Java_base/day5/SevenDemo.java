/*
需求:求[1,500]之间能整除7的数的总和
思路:
(1)定义一个变量num,表示能被7整除的数的个数
(2)定义一个总数sum,表示总数
(3)判断当前的数能被7整除,如果为真, 总数+num并变量num就+1

总结:
(1)for中变量只能在for语句范围内使用
*/
public class SevenDemo
{
	public static void main(String[] args)
	{	
		//定义int类型变量
		int sum = 0;
		for(int num = 1; num <= 500; num++)
		{
			if(num % 7 == 0)
			{
				//System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}