/*
需求:演示三元运算符
步骤:
(1)判断一个数99是不是偶数,并打印结果
(2)求出99和20之间的最大的一个值,并打印结果
(3)一共有55条数据,每页显示10条数据,请问一共分多少页


总结:
(1)三元运算符的两个结果的数据类型要相同
(2)结果类型由结果来决定
*/
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		int a = 99;
		//通过a和2的余数是否为0来判断
		String result = a % 2 == 0 ? "偶数" : "奇数";
		System.out.println(result);
		
		//总数据
		int data = 55;
		//每页数据数量
		int pages = 10;
		//通过总页数和每页数据数量的余是否为0来判断总页数是否需要加1
		int result1 = data % pages == 0 ? data / pages : data/pages+1;
		System.out.println(result1);

	}
}