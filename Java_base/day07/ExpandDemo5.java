/*
����:
���巽�� �����������Ԫ�������е� ����(ֻ�ܱ�1 �� ������������)  �ж�: ���� 

˼·:
(1)���� [2, num)
*/
public class ExpandDemo5
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4, 5, 7};
		//����
		String str = ExpandDemo5.getPrime(arr);
		System.out.println(str);
	}

	static String getPrime(int[] arr)
	{
		String str = "";
		for(int ele : arr)
		{
			int count = 1;
			for(int index = 2; index < ele; index++)
			{
				if(ele % index == 0)
				{
					count = 0;
					break;
				}
			}
			if(count == 1 && ele != 1)
			{
				str = str + ele + ", "; 
			}
		}
		return str;
	}
}