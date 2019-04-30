/*
1:���� int[] arr = {1,2,3,4,5};
	��� arr ������Ԫ��֮��
	��� arr �����е�ż��Ԫ��֮��
	��� arr ��Ԫ���� ��λ���� 3 ��Ԫ��֮��
	�ж� arr ���Ƿ���� 10,���������,10���ڵ�����, �粻�������"������"
˼·: foreach if 

����:
(1)����һ��int��������arr����̬��ʼ��
(2)��������(sum), ż��Ԫ���ܺ�(evensum), ��λ��Ϊ3���ܺ�(threesum)����
(3)����for-each��if�������ż��֮��, ��λ��Ϊ3��Ԫ�ص��ܺ�

�ܽ�:
(1)����for-each��if��Ͽ���ɸѡ����������Ԫ��
*/
public class ExpandDemo1
{
	public static void main(String[] args)
	{
		//����int��������
		int[] arr = new int[]{1, 2, 3, 4, 5, 10};
		//����������sum����
		int sum = 0;
		//����ż��Ԫ��֮��
		int evensum = 0;
		//�����λ������3��Ԫ��֮��
		int threesum = 0;
		//����for-eachѭ��(����Ԫ��֮��)
		for(int a : arr)
		{
			sum = sum + a;
		}
		System.out.println(sum);

		//����for-eachѭ����if�ж�(����ż��Ԫ��֮��)
		for(int a : arr)
		{
			if(a % 2 == 0)
			{
				evensum = evensum + a;
			}
		}
		System.out.println(evensum);

		//����for-eachѭ����if�ж�(����Ԫ�ظ�λ����3��Ԫ��֮��)
		for(int a : arr)
		{
			//��λ��
			if(a % 3 == 0)
			{	
				threesum = threesum + a;
			}
		}
		System.out.println(threesum);

		//����forѭ����if�ж�(�ж����Ԫ��Ϊ10, �������ǰ����)
		int y = 1;
		for(int size = 0; size < arr.length; size++)
		{
			
			if(arr[size] == 10)
			{
				System.out.println("Ԫ��Ϊ10������: " + size);
				y = 0;
			}
		}
		//�ж�y�Ƿ�Ϊ1
		if(y == 1)
		{	
			System.out.println("������");
		}
		
	}
}