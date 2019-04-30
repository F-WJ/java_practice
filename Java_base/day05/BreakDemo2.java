/*
需求:统计出1~100之间,前5个能整数除3的数
步骤:
(1)定义一个变量count,表示能被3整除的个数
(2)遍历1到100
(3)判断i是否被整除,能被3整除count自增1,并打印i
(4)判断count够不够5个,够5个,终止循环

总结: 
(1)利用break语句, 中止循环
(2)break语句只能在循环语句和switch内中使用,不然报错
*/
public class BreakDemo2
{
	public static void main(String[] args)
	{
		
		//定义int类型变量
		int count = 0;
		for(int i = 1; i<= 100; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
				count++;
			}
			if(count == 5)
			{
				break;
			}
			
		}
	}
}