/*
����:
���巽�� �������������,����ż�����ݵ��ۼӺ�
if(ele % 2 == 0)

����:
(1)����getEven����, ����Ϊint��������, ����intֵ
(2)ͨ��for+if����ж�Ԫ���Ƿ�ż��.
*/
public class ExpandDemo2
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4};
		int evenSum = ExpandDemo2.getEven(arr);
		System.out.println(evenSum);
	}

	static int getEven(int[] arr)
	{
		int sum = 0;
		for(int ele : arr)
		{
			if(ele % 2 == 0)
			{
				sum = sum + ele;
			}
		}
		return sum;
	}
}