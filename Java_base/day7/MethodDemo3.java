/*
���󣺶���һ������������һ��int ���飬���ո�ʽ��ӡint ��������
���裺
��1�����巽��
��2��ʵ�ַ�����
��3�����÷���
*/
public class MethodDemo3
{
	static String print(int[] arr)
	{
		String str = "[";
		//forѭ��
		for(int index = 0; index < arr.length; index++)
		{
			if(index == arr.length - 1)
			{
				str = str + arr[index] + "]";
			}
			else
			{
				str = str + arr[index] + ", ";
			}
		}
		//����strֵ
		return str;
	}

	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		String a = MethodDemo3.print(arr);
		System.out.println(a);

	}
}