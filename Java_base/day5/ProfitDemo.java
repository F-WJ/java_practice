/*
����:
������ҵ���ŵĽ������������ɡ�����(profit)���ڻ����10 ��Ԫʱ������(bonus)����
10%���������10 ��Ԫ������20 ��Ԫʱ������10 ��Ԫ�Ĳ��ְ�10%��ɣ�����10 ��Ԫ��
���֣������7.5%��20 ��40 ��֮��ʱ������20 ��Ԫ�Ĳ��֣������5%��40 ������ʱ
����40 ��Ԫ�Ĳ��֣������3%����Ӧ���Ž���������
�������������������Ϊ73 ��ԪΪ�����ó����·���ͼ��
����= (10-0)��10%+(20-10)��7.5%+(40-20)��5%+(73-40)��3%

����:
(1) pro <= 10, ����(bonus)���10%
(2) 10 < pro < 20, 10������,���7.5%
(3) 20 < pro < 40, ����20���������5%
(4) 40 < pro, ����40�����ϵ����3%

���жϽ�������һ���׼�,

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

�ܽ�:
(1)����Ƕ������������,ʹ��if-else if-else���
*/
public class ProfitDemo
{
	public static void main(String[] args)
	{
		//����int���ͱ���
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
			System.out.println("��������ֵ");
		}
	}
}
