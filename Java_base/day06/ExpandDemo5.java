/*
5:int[] arr = {1,2,3,4,5}
  ��arr �е����ݽ��з�ת, ��� {5,4,3,2,1}

˼·: ����length��for

����:
(1)�ȶ���һ��int��������arr����̬��ʼ��
(2)�ٶ���һ��int����������arr2����̬��ʼ��,����Ϊarr�ĳ���
(3)����forѭ��.

�ܽ�:
(1)ͨ��forѭ��, �����������ʼ����, ���԰�Ԫ�ط�ת.
*/
import java.util.Arrays;

public class ExpandDemo5
{
	public static void main(String[] args)
	{
		//����int��������arr
		int[] arr = new int[]{1, 2, 3, 4, 5};
		//����������arr2
		int[] arr2 = new int[arr.length];
		//for
		for(int index = arr.length - 1; index >= 0; index--)
		{
			arr2[index] = arr[(arr.length - 1) - index];
		}
		arr = arr2;

		System.out.println(Arrays.toString(arr));
	}
}