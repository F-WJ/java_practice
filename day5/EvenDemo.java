/*
����:�ҳ�[1,500]֮��ż���ĸ���
���裺
��1������1 ��500 ����
��2���ж��Ƿ���ż�����ܱ�2 �����ľ���0 ��
��3���������count ��Ϊ�����������Ϊż����count ��1.

�ܽ�:
(1)num % 2 == 0 �ȼ��� num % 2 != 0 ,������num % 2 == 1, ע�⸺�������
*/
public class EvenDemo
{
	public static void main(String[] args)
	{
		//�������������
		int count = 0;
		for(int num = 1; num <= 500; num++)
		{
			if(num % 2 == 0)
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}