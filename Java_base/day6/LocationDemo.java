/*
���󣺶���һ��int ��������,���������������ż��λ��Ԫ��֮��

����:
(1)����һ��int���������һ���ܺͱ���sum
(2)����forѭ����������
(3)����if����ж������Ƿ�Ϊż��

�ܽ�:
(1)�����Ҫ�������������,ѡ��forѭ��
*/

public class LocationDemo
{
	public static void main(String[] args)
	{
		//����һ��int��������
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};
		//ż���ܺͱ���
		int sum = 0;
		//����for��������
		for(int size = 0; size < arr.length; size++)
		{
			//����if�ж������Ƿ�Ϊż��
			if(size % 2 == 0)
			{
				sum += arr[size];
			}
		}
		System.out.println(sum);
	}
}