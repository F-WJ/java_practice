/*
����:ͳ�Ƴ�1~100֮��,ǰ5����������3����
����:
(1)����һ������count,��ʾ�ܱ�3�����ĸ���
(2)����1��100
(3)�ж�i�Ƿ�����,�ܱ�3����count����1,����ӡi
(4)�ж�count������5��,��5��,��ֹѭ��

�ܽ�: 
(1)����break���, ��ֹѭ��
(2)break���ֻ����ѭ������switch����ʹ��,��Ȼ����
*/
public class BreakDemo2
{
	public static void main(String[] args)
	{
		
		//����int���ͱ���
		int count = 0;
		for(int i = 1; i<= 100; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
				count++;
			}
			if(count == 5)
			{
				break;
			}
			
		}
	}
}