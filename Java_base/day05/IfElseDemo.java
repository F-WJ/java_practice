/*
����:��ʾif-else����ʹ��
����:
(1)����һ���������͵ı���a
(2)�ж�a����������ż��,�����ż����ӡ"a��ż��",�����ӡ"a������"

�ܽ�:
(1)if-else�﷨: if(boolean���ʽ){ ����� } else{ ����� }
(2)ע��: a%2==0, �ȼ���a%2 != 0, ����a%2 == 1, ��ΪҪ���Ǹ��������
*/
public class IfElseDemo
{
	public static void main(String[] args)
	{
		//����int���ͱ�������ֵ
		int a = 10;
		if(a % 2 == 0)
		{
			System.out.println("a��ż��");
		}
		else
		{
			System.out.println("a������");
		}
	}
}