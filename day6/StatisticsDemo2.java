/*
���󣺶���һ����������һ��int ���͵Ķ�ά���飬��������Ԫ��ֵ��0 �Ĵ�����
���磺���飺{{1,2,0,4,0}��{0,3,5}},���Ϊ3

˼·:
(1)�ȶ���һ����sum(0������), ����for(;;){},������for( : ){},��if���, ���Ԫ��Ϊ0,���1 ,Ƕ��ѭ��

�ܽ�:
(1)�������ֻ��Ҫ��ȡ�����Ԫ��,����ֱ��ʹ��foreach
*/

public class StatisticsDemo2
{
	public static void main(String[] args)
	{
		int num = 0;



		int[][] arr = new int[][]{{1, 2, 0, 4, 0}, {0, 3, 5}};
		for(int[] a : arr)
		{
			for(int b : a)
			{
				//System.out.println(b);
				if(b == 0)
				{
					num++;
				}
			}
			
		}
		System.out.println(num);
	}
}