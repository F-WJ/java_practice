/*
����:
���巽��,ɸѡ���������������е�����,�������µ������в��ҷ����µ�����.

����:
(1)
*/
public class ExpandDemo6
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[]{1, 2, 3};
		int[] arr2 = new int[]{4, 5, 6};
		int[] arr3 = ExpandDemo6.getOdd(arr1, arr2);
		System.out.println(java.util.Arrays.toString(arr3));
	}

	static int[] getOdd(int[] arr1, int[] arr2)
	{
		//�������鳤��
		int num = 0;
		for(int ele : arr1)
		{
			if(ele % 2 != 0)
			{
				num++;
			}
		}
		for(int ele :arr2)
		{
			if(ele % 2 != 0)
			{
				num++;
			}
		}
		int[] arr3 = new int[num];
		
		//���������������������
		int index = 0;
		for(int ele : arr1)
		{
			if(ele % 2 != 0)
			{
				arr3[index] = ele;
				index++;
			}
		}
		for(int ele :arr2)
		{
			if(ele % 2 != 0)
			{
				arr3[index] = ele;
				index++;
			}
		}

		return arr3;

	}
}