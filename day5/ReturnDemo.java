/*
����:��1�����10,����������Ϊ7,����ֹ����
����:
(1)ѭ����ӡ1��10
(2)�ж�ѭ�������Ƿ�Ϊ7,�Ǿ���ֹ����,�����ӡѭ������

�ܽ�:
(1)return: ��ʾ��������
*/
public class ReturnDemo
{
	public static void main(String[] args)
	{
		for(int num = 1; num <= 10; num++)
		{
			if(num == 7)
			{
				return;
			}
			System.out.println(num);
		}
		System.out.println("ending.....");
	}
}