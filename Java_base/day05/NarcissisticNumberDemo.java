/*
����:��ӡ���е�ˮ�ɻ���,��νˮ�ɻ�����ָһ����λ��[100,999],
���λ���ֵ�����֮�͵��ڸ�������.

��������
(1)�����λ��,��λ,ʮλ,��λ
(2)if�ж�

�ܽ�:
(1)����ͨ������������,���ֲ�����
*/
public class NarcissisticNumberDemo
{
	public static void main(String[] args)
	{
		for(int num = 100; num <= 999; num++)
		{
			//��λ
			int a = num / 100;
			//ʮλ
			int b = num % 100 / 10;
			//��λ
			int c = num % 100 % 10;
			if(num == (a*a*a + b*b*b + c*c*c))
			{
				//System.out.println(a + "," + b + "," + c);
				System.out.println(num);
			}
		}
	}
}