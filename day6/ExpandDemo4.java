/*
4:int[] arr1 = {1,2,3};
  int[] arr2 = {4,5,6};
  ʹ�ô��뽫���������Ԫ�� �ϳ�һ���µ�����

˼·: length��for

����:
(1)�ȶ���int��������arr1��arr2���鲢��̬��ʼ��
(2)�ٶ���int��������arr3����̬��ʼ��,����Ϊarr1��arr2�ĳ���
(3)����forѭ������,�������������Ԫ�ؼ���arr3������
�ܽ�:
(1)���������ϵ�һ���ʱ��,ע��ڶ������Ԫ�ؼ����ʱ��, ��������������Ǵ�0��ʼ, 
���ǴӼ����һ���������һ������ + 1.
*/
import java.util.Arrays;

public class ExpandDemo4
{
	public static void main(String[] args)
	{
		//����int��������arr1
		int[] arr1 = new int[]{1, 2, 3};
		//����int��������arr2
		int[] arr2 = new int[]{4, 5, 6};
		//����int��������arr3
		int[] arr3 = new int[arr1.length + arr2.length];
		
		//forѭ��
		int index = 0;
		for(index = 0; index < arr1.length; index++)
		{
			arr3[index] = arr1[index];
		}
		for(int a = 0; a < arr2.length; a++)
		{
			arr3[index] = arr2[a];
			index ++;
		}

		System.out.println(Arrays.toString(arr3));
	}
}