/*
����:
1:���巽�� ��� ���������е����ֵ����Сֵ,������
���� = arr[0]

����:
(1)����һ������getValue, ����Ϊint��������
(2)ͨ��for+if����ж����ֵ����Сֵ
(3)��������
*/
public class ExpandDemo1
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		int[] a = ExpandDemo1.getValue(arr);
		System.out.println(java.util.Arrays.toString(a));
	}


	static int[] getValue(int[] arr)
	{
		int arr2[] = new int[2];
		int min = arr[0];
		int max = arr[0];
		for(int ele : arr)
		{
			if(min > ele)
			{
				min = ele;
			}
			else
			{
				max = ele;
			}
		}
		arr2[0] = min;
		arr2[1] = max;
		
		return arr2;
	}
}