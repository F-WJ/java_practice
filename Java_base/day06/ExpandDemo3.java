/*
3:int[] arr = {1,2,3,4,5,5,5,1,10} 
		��� arr ��ÿ�������ֵĴ���
			1 ������ 2��
			2 ������ 1��
			3 ������ 1��
			..

˼·: foreach �½�һ������(����Ѿ�������Ԫ��, ͨ��if���ж��Ƿ����)

����:
(1)�ȶ���һ��int��������arr����̬��ʼ����һ����ʱ����temp(��ʾ�Ѿ�������Ԫ��)
(2)�ٶ���һ������x(��if������ж�Ԫ���Ƿ��Ѿ���ǰ���ܼƹ���)���ܴ���sum
(3)����for + if�����ͳ��Ԫ�س��ִ������ж�Ԫ���Ƿ��Ѿ�����.


�ܽ�:
(1)ͨ��һ������, if��������Ͽ������������ĳһԪ���Ƿ��Ѿ�ʹ�ù��Ĺ���.
*/

import java.util.Arrays;

public class ExpandDemo3
{
	public static void main(String[] args)
	{
		//����һ��int��������
		int[] arr = new int[]{1, 1, 3, 4, 5, 5, 6, 7, 8};
		//��ʱ����(��ʾ�Ѿ�������Ԫ��)
		int[] temp = new int[arr.length];
		//���ִ���
		int sum = 0;
		//�ж��Ƿ�����ʱ����temp�����Ԫ��(0������)
		int x = 0;
		//forѭ������arr
		for(int index = 0; index < arr.length; index++)
		{	
			
			//�ж�arr����Ԫ�ص�ֵ�Ƿ���ڵ�ǰarr
			for(int a = 0; a < arr.length; a++)
			{
				if(arr[index] == arr[a])
				{
					sum = sum + 1;
				}
			}
			//��arr[index]��ŵ�temp������
			for(int ele : temp)
			{
				//�����Ԫ�����,����ӡ����
				if(ele == arr[index])
				{
					x = 1;
					break; //����ѭ��
				}
			}
			if(x == 0)
			{
				System.out.println(arr[index] + " ������ "+ sum + " ��");
				temp[index] = arr[index];
			}
			
			//��ʼ������
			x = 0;
			sum = 0;		
		}
		System.out.println(Arrays.toString(temp));
	}
}