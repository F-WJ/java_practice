/*
����:��[1,500]֮��������7�������ܺ�
˼·:
(1)����һ������num,��ʾ�ܱ�7���������ĸ���
(2)����һ������sum,��ʾ����
(3)�жϵ�ǰ�����ܱ�7����,���Ϊ��, ����+num������num��+1

�ܽ�:
(1)for�б���ֻ����for��䷶Χ��ʹ��
*/
public class SevenDemo
{
	public static void main(String[] args)
	{	
		//����int���ͱ���
		int sum = 0;
		for(int num = 1; num <= 500; num++)
		{
			if(num % 7 == 0)
			{
				//System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}