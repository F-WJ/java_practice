/*
����: ��ʾǿ������ת��
����:
(1)����һ��int���ͱ���a
(2)����һ��byte���ͱ���b
(3)����һ����������a��b�ĺ�
(4)��double���͵ĳ���ת��Ϊint����

�ܽ�:
(1)������ʹ��ǿת,���ܻ���ʧ����(����doubleתint)
*/

public class TypeConvertDemo2
{
	public static void main(String[] args)
	{
		//����int��byte���ͱ���,����ֵ
		int a = 1;
		byte b = 2;
		int demo = a + b;
		int c = (int)3.14;
		System.out.println(c);

	}
}