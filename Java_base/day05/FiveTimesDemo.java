/*
����:��ӡ[1,500]֮����5�ı���֮��

�ܽ�:
(1)for��ʼ���ı���ֻ����for�����ʹ��
*/
public class FiveTimesDemo
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int sum = 0;
		for(int num = 1; num <= 500; num++)
		{
			if(num % 5 == 0)
			{
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}