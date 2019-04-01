/*
需求:计算12个月货款利息之和(toatlinterest),假如学费16000.00, 每月利率1%,不用利滚利
思路:
(1)1个月是: 1一个月的利率 = 学费*利率, 12个月是: 12*一个月的利率
(2)通过以上公式计算结果

总结:
(1)算术表达式的最终结果类型是表达式中类型最高类型
*/
public class InterestDemo
{
	public static void main(String[] args)
	{
		//定义一个double类型变量
		double tuition = 16000.00;
		double result = 12 * tuition * 0.01;
		System.out.println(result);
	}
}