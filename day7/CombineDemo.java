/*
���󣺶���һ����ΪcombineArrays �ķ�����������int ���͵�����arr1 ��arr2 ��Ϊ������
ʵ�ֽ�arr1 ��arr2 ��������ϲ�Ϊһ���µ����飬�����غϲ���������顣
���磺arr1={1,2},arr2={3,4}����÷���Ӧ�÷���{1,2,3,4}��
˼·��
��1�����������Ҫ���Ԫ�ظ���
��2������һ���µ������ŷ���Ҫ���Ԫ��
��3��������Ҫ���Ԫ�ش�ŵ��µ�������

�ܽ�:
(1)�ϲ������ʱ��,ע��������ĳ�������������֮��
*/
import java.util.Arrays;

public class CombineDemo
{
	//������
	public static void main(String[] args)
	{
		//�����������鲢��̬��ʼ��
		int[] arr1 = new int[]{1, 2, 3};
		int[] arr2 = new int[]{4, 5, 6};

		//����arrcompound����
		String arr3 =  CombineDemo.arrcompound(arr1, arr2);
		System.out.println(arr3);
	}


	//����������ϲ���һ������ķ���
	static String arrcompound(int[] arr1, int[] arr2)
	{
		//arr1��arr2���ܳ���
		int size = arr1.length + arr2.length;
		//����һ��������
		int[] arr3 = new int[size];
		//��ʼ������
		int index = 0;

		//foreachѭ����������

		for(index = 0; index < arr1.length; index ++)
		{
			arr3[index] = arr1[index];
		}
		for(int index2 = 0; index2 < arr2.length; index2 ++)
		{
			arr3[index] = arr2[index2];
			index ++;
		}
		//���ý�����ת�����ַ�����ʾ
		String a = CombineDemo.arrstring(arr3); 
		//����
		return a;	
	}



	//������װ�����ַ���
	static String arrstring(int[] arr)
	{
		//����һ��String����
		String str = "[";
		//foreachѭ��
		for(int index = 0; index < arr.length; index ++)
		{
			if(index != arr.length - 1)
			{
				str = str + arr[index] + ", ";
			}
			else
			{
				str = str + arr[index] + "]";
			}
		}

		//����
		return str;
	}
}