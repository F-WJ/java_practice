/*
���󣺰���ĳ�ָ�ʽ����ӡ�������е�Ԫ�أ���ӡЧ��Ϊ��[11,22,33,44,22,55]
���裺
��1�����岢��ʼ������nums
��2������һ���ַ������͵ı���str������ƴ���ַ���
��3���������鲢ƴ��Ԫ�ص�str
��4���ж�Ϊ���һ��Ԫ��ƴ�ӡ�]��������ƴ�ӡ�����
��5����ӡstr

�ܽ�:
(1)�����Ҫ���������������,ѡ��for
*/

public class ArrayDemo6
{
	public static void main(String[] args)
	{
		//�������鲢��ʼ��
		int[] nums = new int[]{11, 22, 33, 44, 22, 55};
		//����һ��String���ͱ���
		String str = "[";

		//����for��������
		for(int size = 0; size < nums.length; size++)
		{
			if(size == nums.length - 1)
			{
				str = str + nums[size] + "]";
			}
			else
			{
				str = str + nums[size] + ", ";
			}
		}
		System.out.println(str);
	}
}