/*
����: ��ʾ�Զ�����ת��
����:
(1)int����ת��Ϊlong
(2)long����ת��Ϊflaot
(3)���͵��Զ�����
	int���͵�ֵ��int���͵�ֵ���,�������������������֮��
	byte���͵�ֵ��int���͵�ֵ���,�������������������֮��
	byte���͵�ֵ��byte���͵�ֵ���,�������������������֮��
	char ���͵�ֵ��int ���͵�ֵ��ӣ��������������������֮��
	int��float��double��long ���͵�ֵ��ӣ���������������б���֮��

�ܽ�: 
(1)�Զ�ת������: byte, short, char --> int --> long --> float --> double
(2)����������ʱ,byte,short,char�Զ�������int����
(3)�������ս��,���������ɱ��ʽ������������;���
*/
public class TypeConvertDemo1
{
	public static void main(String[] args)
	{
		//int����ת��long����
		long index = 1;
		//long����ת��float����
		float f1 = index;
		
		//�����Զ�����
		int a = 1;
		int b = 2;
		byte c = 3;
		char d = 4;
		float f2 = 3.14F;
		double d1 = 3.14;
		//int��int���
		int demo = a + b;
		//byte��int���
		int demo1 = a + c;
		//byte��byte���
		int demo2 = c + c;
		//char��int���
		int demo3 = d + a;
		//int,float,double,long���
		double demo4 = a + c + f2 + d1;
	}
}