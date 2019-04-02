/*
需求:
需求：企业发放的奖金根据利润提成。利润(profit)低于或等于10 万元时，奖金(bonus)可提
10%；利润高于10 万元，低于20 万元时，低于10 万元的部分按10%提成，高于10 万元的
部分，可提成7.5%；20 万到40 万之间时，高于20 万元的部分，可提成5%；40 万以上时
高于40 万元的部分，可提成3%；求应发放奖金总数？
【问题分析】：以利润为73 万元为例，得出如下分析图。
利润= (10-0)×10%+(20-10)×7.5%+(40-20)×5%+(73-40)×3%

步骤:
(1) pro <= 10, 奖金(bonus)提成10%
(2) 10 < pro < 20, 10万以上,提成7.5%
(3) 20 < pro < 40, 高于20万以上提成5%
(4) 40 < pro, 高于40万以上的提成3%

先判断奖金在哪一个阶级,

(1)
pro<=10:
bonus = pro * 0.1

(2)
10 < pro < 20
bonus = (10 * 0.1) + ((pro - 10) * 0.075)

(3)
20 < pro < 40
bonus = (10 * 0.1) + ((20 - 10) * 0.075) + ((pro - 20) * 0.05)

(4)
pro > 40
bonus = (10 * 0.1) + ((20 - 10) * 0.075) + ((40 - 20) * 0.05) + ((pro - 40) * 0.03)

总结:
(1)如果是多种条件情况下,使用if-else if-else语句
*/
public class ProfitDemo
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int pro = 73;
		double bonus = 0; 
		if(pro <= 10)
		{
			bonus = pro * 0.1;
			System.out.println(bonus);
		}
		else if(pro > 10 && pro <= 20)
		{
			bonus = (10 * 0.1) + ((pro - 10) * 0.075);
			System.out.println(bonus);
		}
		else if(pro > 20 && pro <= 40)
		{
			bonus = (10 * 0.1) + ((20 - 10) * 0.075) + ((pro - 20) * 0.05);
			System.out.println(bonus);
		}
		else if(pro > 40)
		{
			bonus = (10 * 0.1) + ((20 - 10) * 0.075) + ((40 - 20) * 0.05) + ((pro - 40) * 0.03);
			System.out.println(bonus);
		}
		else
		{
			System.out.println("请输入数值");
		}
	}
}

