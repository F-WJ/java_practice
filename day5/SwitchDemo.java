/*
����:ʹ��switch�����,���������һ������,�ж������ڼ�
����:
(1)����һ���������͵ı���weekday
(2)�жϱ���weekday,���weekdayΪ1���"��һ",�������

�ܽ�:
(1)switchת������������ֻ����byte,short,char,int, ������long
(2)case��ʾִ�д������, һ������case,�����һֱִ��, ֪������break, return,����֪��switch������ֹͣ.
*/
public class SwitchDemo
{
	public static void main(String[] args)
	{
		int weekday = 9;

		switch(weekday)
		{
			case 1 : System.out.println("��һ"); break;
			case 2 : System.out.println("�ܶ�"); break;
			case 3 : System.out.println("����"); break;
			case 4 : System.out.println("����"); break;
			case 5 : System.out.println("����"); break;
			case 6 : System.out.println("����"); break;
			case 7 : System.out.println("����"); break;
			default:
				System.out.println("����������1~7"); break;
		}
	}
}