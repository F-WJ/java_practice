/*
����:��ʾwhile��do-while������
����:
(1)����������������a��b
(2)�ֱ�ʹ��while��do while�ж� a > b

ע��:�������whileû�д�ӡ�κ�����,do while��ӡ��һ��"a > b", ������ҵ���

�ܽ�:
(1)while��do-while����������, while���жϺ�����ѭ����, do-while�෴
*/
public class DoWhileDemo1
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int a = 10;
		int b = 20;
		
		//while���
		while(a > b)
		{
			System.out.println("a > b");
		}
		
		System.out.println("--------------");
		
		//do-while���
		do
		{
			System.out.println("a > b"); //������ѭ����
		}
		while (a > b);
	}
}