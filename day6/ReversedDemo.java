/*
���󣺶���һ��Ԫ��ΪString �������飬���ո�ʽ�����ӡ�������Ԫ�أ�����
��������Ϊ��{��A������B������C������D��},��ӡЧ��Ϊ��[D,C,B,A]
˼·��
��1���½�һ������(��СΪԴ����Ԫ������)
��2������for( : ){}��ӡ����Ԫ��,֮�����������

�ܽ�:
(1)���������������ͨ��������.length - 1�����
*/
public class ReversedDemo
{
	public static void main(String[] args)
	{
		//����һ��int��������
		String[] arr = new String[]{"A", "B", "C", "D"};
		//arr����ĳ���
		int num = arr.length;
		//
		String str = "[";
		//����forѭ��
		for(int size = num - 1; size >= 0; size--)
		{
			//System.out.println(arr[size]
			if(size == 0)
			{
				str = str + arr[size] + "]";
			}
			else
			{
				str = str + arr[size] + ", ";
			}
		}
		System.out.println(str);

	}
}