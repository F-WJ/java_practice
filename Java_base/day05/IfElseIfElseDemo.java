/*
����:��ʾif-else if-else����ʹ��
����:
(1)�����������͵�������a��b
(2)�ж�a��b�Ĵ�С��ϵ

�ܽ�
(1)if-elseif-else�﷨:  if(boolean���ʽ){ ����� }
					    else if(boolean���ʽ){ ����� }
					    else{ ����� }

*/
public class IfElseIfElseDemo
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int a = 10;
		int b = 20;

		if(a > b)
		{
			System.out.println("a ���� b");
		}
		else if(a < b)
		{
			System.out.println("a С�� b");
		}
		else
		{
			System.out.println("a ���� b");
		}
	}
}