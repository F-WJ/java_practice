/*
����:��1�����10,��Ҫ���4
����:
(1)ѭ������1��10����
(2)�ж����iΪ4,������ǰѭ��,�����ӡ

�ܽ�:
(1)continue: ��ʾ������һ��ѭ��,�����������ѭ���Ļ�,����ѭ��
*/
public class ContinueDemo
{
	
	public static void main(String[] args)
	{
		for(int num = 1; num <= 10; num++)
		{
			if(num == 4)
			{
				continue;
			}
			System.out.println(num);
		}
	}
}