/*
����:����qq���ߵ������ж�qq�ĵȼ�
����:
(1)����һ������days,��ʾ����
(2)�ж�������Χ

�ܽ�:
(1)��boolean���ʽҪ�������������true��ʱ��,����ʹ��&&
*/
public class IfElseIfElseDemo3
{
	public static void main(String[] args)
	{
		int day = 22;
		if(day >=0 && day < 5)
		{
			System.out.println("û�еǼ�");
		}
		else if(day >= 5 && day < 12)
		{
			System.out.println("��");
		}
		else if(day >= 12 && day < 21)
		{
			System.out.println("���");
		}
		else if(day >= 21 && day < 32)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("������������");
		}

	}
}
