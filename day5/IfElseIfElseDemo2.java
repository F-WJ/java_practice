/*
����:���������һ������,�ж������ڼ�?
����:
(1)����һ���������͵ı���weekday
(2)�жϱ���weekday,���weekdayΪ1���"��һ",�������

�ܽ�:
(1)if-else-else������ǰ��boolean��Ϊfalse, �������һ�������
*/
public class IfElseIfElseDemo2
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int weekday = 9;
		
		if(weekday == 1)
		{
			System.out.println("��һ");
		}
		else if(weekday == 2)
		{
			System.out.println("�ܶ�");
		}
		else if(weekday == 3)
		{
			System.out.println("����");
		}
		else if(weekday == 4)
		{
			System.out.println("����");
		}
		else if(weekday == 5)
		{
			System.out.println("����");
		}
		else if(weekday == 6)
		{
			System.out.println("����");
		}
		else if(weekday == 7)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����������1~7֮�ڵ�����");
		}
	}
}