/*
需求:请定义一个整数类型的变量sc,代表小明的分数,请写一段程序判断并打印小明成绩是否合格
步骤:
(1)如果sc>=60,返回"合格",或者返回"不合格"
(2)打印运算后结果

总结: 
(1)三元运算符定义的变量类型要和结果的类型一致
*/
public class ScoreDemo
{
	public static void main(String[] args)
	{
		// 定义一个int类型变量
		int sc = 70;
		String result = sc>=60  ? "合格" : "不合格";
		System.out.println(result);
	}
}