/*
����:��ʾ�Ƚ������
����:
(1)ʹ��> < >= <= != ==�ȱȽ�������ò��������������͵ĳ���
(2)��������int���͵ı���a��b
(3)ʹ�ñȽ������������������,������һ���������������н��

�ܽ᣺
(1) �Ƚ�������������boolean����
*/
public class ComparisonOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(10 > 5);
		System.out.println(10 >= 5);
		System.out.println(10 >= 10);
		System.out.println(10 < 5);
		System.out.println(10 <= 5);
		System.out.println(10 <= 10);
		System.out.println(10 == 10);
		System.out.println(10 != 10);

		//ʹ�ñ�������
		int a = 10;
		int b = 5;
		boolean result = a > b;
		System.out.println(result);
	}
}