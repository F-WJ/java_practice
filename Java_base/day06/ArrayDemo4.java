/*
�����ҳ�����ֵԪ��22,�������е�һ�γ��ֵ�����λ��
���裺
��1������һ������nums������ʼ��������
��2������һ������key����ʾ��������Ԫ��
��3����������
��4���ж������ǰԪ�غ�key ��ȣ�֤���ҵ�Ԫ�أ���ӡ������ѭ��

�ܽ�:
(1)����ͨ��forѭ������ȡ����ÿһ��Ԫ�غͶ�Ӧ������
*/

public class ArrayDemo4
{
	public static void main(String[] args)
	{
		//���岢��ʼ������
		int[] nums = new int[]{1, 2, 33, 22, 55};
		//����int���ͱ���(��ʾҪ������Ԫ��)
		int key = 22;
		//����for��������
		for(int size = 0; size < nums.length; size++)
		{
			//�ж�����Ԫ���Ƿ����keyֵ
			if(nums[size] == key)
			{
				System.out.println(size);
			}
		}
	}
}