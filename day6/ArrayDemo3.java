/*
��������Ļ�������
���裺
��1������һ������nums,����̬��ʼ��������
��2������һ������size ��ȡnums �����鳤��
��3����ȡ����Ԫ��
��4����������Ԫ��
��5����������

�ܽ�:
(1)ע������һ����ʼ���ɹ�, ����ĳ����ǹ̶���,���������ٳ�ʼ��.
*/

public class ArrayDemo3
{
	public static void main(String[] args)
	{
		//��������,����̬��ʼ��
		int[] nums = new int[]{1, 2, 3, 4};
		//��ȡnums�����鳤��
		int size = nums.length;
		//��ȡ����Ԫ��
		int num = nums[0];
		System.out.println(num);
		//��������Ԫ��
		nums[0] = 5;
		System.out.println(nums[0]);
		//��������
		for(int a = 0; a < nums.length; a++)
		{
			System.out.println(nums[a]);
		}
		
	}
}