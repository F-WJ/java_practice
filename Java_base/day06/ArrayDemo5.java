/*
�������int �������������Ԫ��ֵ
���裺
��1�����岢��ʼ������nums
��2������һ������max ��ʾ����Ԫ�أ�������nums �ĵ�һ��Ԫ��Ϊ���ֵ
��3��ʹ��foreach ѭ������nums ����
��4���ж����������Ԫ�غ�max �Ƚϣ�������Ԫ�رȽϴ󣬾ͽ���ǰԪ�ظ�ֵ��max
��5��������ɴ�ӡmax

�ܽ�:
(1)���������Ҫ����Ԫ��,����ʹ��foreach����������
*/
public class ArrayDemo5
{
	public static void main(String[] args)
	{
		//���岢��ʼ������nums
		int[] nums = new int[]{1, 22, 343, 33, 2132, 323};
		//����һ��int���ͱ���max(��ʾ�������ֵ)
		int max = nums[0];
		//ͨ��foreachѭ������������Ԫ��
		for(int a : nums)
		{
			//�жϵ�ǰԪ���Ƿ����max,�������, ��aԪ�ظ�ֵ��max
			if(a > max)
			{
				max = a;
			}
		}
		System.out.println(max);
	}
}