/*
���󣺰���ĳ�ָ�ʽ����ӡ�������е�Ԫ�أ���ӡЧ��Ϊ��[11,22,33,44,22,55]
���裺
��1�����岢��ʼ������nums
��2������һ���ַ������͵ı���str������ƴ���ַ���
��3���������鲢ƴ��Ԫ�ص�str
��4���ж�Ϊ���һ��Ԫ��ƴ�ӡ�]��������ƴ�ӡ�����
��5����ӡstr

�ܽ�:
(1)��ά���龲̬��ʼ���﷨: ����Ԫ������[][] ������ = new ����Ԫ������[][]{����1, ����2, ����3...};
*/

public class ArrayInArrayDemo
{
	public static void main(String[] args)
	{
		//�����ά����
		int[][] arr;
		//��̬��ʼ����ά����
		arr = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		//��̬��ʼ����ά����
		arr = new int[3][3];
		//��ȡ��ά�����Ԫ��
		int[] a = arr[0];
		System.out.println(a); //[I@659e0bfd
		//���ö�ά�����Ԫ��
		arr[0][0] = 1;
		int b = arr[0][0];
		System.out.println(b);

		//forѭ������
		for(int x = 0; x < arr.length; x++)
		{
			System.out.println(arr[x]);
			for(int y = 0; y < arr[x].length; y++)
			{
				System.out.println(arr[x][y]);
			}
		}
		//foreachѭ������
		for(int[] x : arr)
		{
			for(int y : x)
			{
				System.out.println(y);
			}
		}
	}
}