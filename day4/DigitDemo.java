/*
����:����һ��int�������һ����λ��������,�ֱ������λ���ϵ�ֵ,ʮλ���ϵ�ֵ�͸�λ���ϵ�ֵ
����:
(1)��λ:���ó���
(2)ʮλ:����ȡ��(%)�ͳ���(/)
(3)��λ:����ȡ��(%)

�ܽ�:
(1)int��������������������
*/
public class DigitDemo
{
	public static void main(String[] args)
	{
		int a = 223;
		//��λ
		int b = a / 100; 
		System.out.println(b);
		//ʮλ
		int c = a % 100 / 10;
		System.out.println(c);
		//��λ
		int d = a % 100 % 10;
		System.out.println(d);
	}
}