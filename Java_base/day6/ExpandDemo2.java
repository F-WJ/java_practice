/*
2:����int[] arr = {1,-2,-3,4,9},�ҳ�arr�����е�����,�������µ�����newArr��
˼·: foreach if

����:
(1)����һ��int��������arr����̬��ʼ��
(2)�ٶ���һ��int��������newarr����̬��ʼ��, ����ΪarrԪ�ص������ܺ�
(3)����for-each��if����ҳ�arr��������, �����浽newarr��

�ܽ�:
(1)for-each��if�����, �ڲ���Ҫʹ������ֵ��ʱ��, ɸѡĳ��Ԫ�ص�ʱ��,������Ӽ��.
*/

//��
import java.util.Arrays;

public class ExpandDemo2
{
	public static void main(String[] args)
	{
		//����int��������
		int[] arr = new int[]{1, -2, -3, 4, 9};

		//�ҳ�arr��������
		int sum = 0;
		for(int ele : arr)
		{
			if(ele > 0)
			{
				sum ++;
			}
		}

		//����������
		int[] newarr = new int[sum];

		//����һ������
		int index = 0;
		//����forѭ��
		for(int ele : arr)
		{
			if(ele > 0)
			{
				newarr[index] = ele;
				index ++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
		
		//for(int ele : newarr)
		//{
		//	System.out.println(ele);
		//}
	}
}