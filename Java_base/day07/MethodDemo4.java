/*
���󣺶���һ������������һ��int ���飬����ָ��Ԫ���������е�һ�γ��ֵ�����
���裺
��1�����巽��indexSearch
��2��ʵ�ַ�����(forѭ������)
��������
�����ǰԪ�غ�ָ��Ԫ����ͬ�����ص�ǰԪ�����ڵ�����
��������Ԫ�غ󣬷����Ҳ����򷵻�-1����ʾ�Ҳ�������
��3�����÷���

�ܽ᣺
(1)ͨ��for��if��Ͽ����ҵ�ָ��ֵ  
*/

public class MethodDemo4
{
	static int indexSearch(int[] arr, int num)
	{
		for(int index = 0; index < arr.length; index++)
		{
			if(arr[index] == num)
			{
				return index;
			}
		}
		return -1; //-1��ʾ��ǰ����û�����ֵ
	}

	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		//���÷���
		int index = MethodDemo4.indexSearch(arr, 2);
		System.out.println(index);
	}
}
