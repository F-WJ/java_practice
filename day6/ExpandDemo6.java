/*
6:int[] arr = {1,2,3,4,5}�������
˼·: for for

����:
(1)����һ��int��������arr����̬��ʼ��
(2)����for��forǶ�����, �����Ǽ�������ѭ������, �������ж�ÿһ��Ԫ�غ�����Ԫ�ش�С, �������, ���߶Ի�


�ܽ�:
(1)����for, if���, ����������Ԫ��С��������, ���ߴӴ�С
*/
import java.util.Arrays;

public class ExpandDemo6
{
	public static void main(String[] args)
	{
		//����int��������arr
		int[] arr = new int[]{5, 1, 3, 4, 5, 5, 9};
		int temp = 0;
		for(int time = 0; time < arr.length; time++)
		{
			for(int index = time; index < arr.length - time; index++)
			{
				if(arr[time] > arr[index])
				{
					temp = arr[time];
					arr[time] = arr[index];
					arr[index] = temp;
					
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}