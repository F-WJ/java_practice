/*
����:��1�����10, ����������Ϊ7,��ֹͣѭ��
����:
(1)ѭ����ӡ1��10
(2)�ж�ѭ�������Ƿ�Ϊ7,�Ǿ�ֹͣѭ��,�����ӡѭ������

�ܽ�:
(1)break:��ʾֹͣ��ǰ����ѭ��
*/
public class BreakDemo
{
	public static void main(String[] args)
	{
		for(int num=1; num <= 10; num++)
		{
			if(num == 7)
			{
				break;
			}
			System.out.println(num);
		}
		System.out.println("ending....");
	}
}