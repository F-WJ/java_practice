/*
���󣺶���һ���������飬�������е�0 ȥ���󷵻�һ�������顣
���磺����Ϊint[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15}; Ҫ������������Ϊ0 ��Ԫ��
ȥ���� ����Ϊ0 ��ֵ����һ�������飬 �����µ�������Ϊ����ֵ: int[]
newArr={1,13,45,5,16,6,25,4,17,6,7,15};

˼·:����for( : ){}��ѭ��, ������if����ж�, ���Ϊtrue, ����������
*/
public class StatisticsDemo3
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
		int numzero = 0;
		int num = 0;
		
		//����������Ԫ������
		for(int element : arr)
		{
			if(element != 0)
			{
				numzero++;
			}
		}
		int[] newarr = new int[numzero];

		//ȥ0����
		for(int element : arr)
		{
			//System.out.println(element);
			if(element != 0)
			{
				newarr[num] = element;
				num++;
			}
		}

		//��ӡ������
		for(int element : newarr)
		{
			System.out.println(element);
		}
	}
}