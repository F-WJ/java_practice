/*
 * ���������1-100 ���������������(�����ֳ�������һ������1 ����Ȼ�����������1
 * ���������⣬���ܱ�������Ȼ����������)��
 * ˼·��
 *��1��һ����num ��[2��num)�����Χ�������жԱȣ�����ܱ������Ͳ���Ҫ���жԱ�
 *��2��5 ��������ô��Ҫ���Ƕ���һ��������������¼����Ҫ��ĸ���
 *��3��������Ҫ���ǵ���ѭ��
 *
 *�ܽ�:
 *(1)������ĳһ��if���ص�ʱ��, ע���ʼ������
 */
package cn.wolfcode.array;

public class PrimeNumbeDemo {
	public static void main(String[] args)
	{
		int count = 0;
		//
		int temp = 0;
		for(int num = 100; num > 1; num--)
		{
			//�ж��Ƿ�Ϊ����
			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					temp = 1;
					break;
				}
			}
			if(temp == 0)
			{
				System.out.println(num);
				count++;
			}
			if(count == 5)
			{
				break;
			}
			//��ʼ��
			temp = 0;
			
		}
	}
	
}
