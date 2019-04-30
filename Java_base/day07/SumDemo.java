/*
���󣺶���һ������getSum����������int ���͵Ĳ���[min, max]�������������������
Χ֮�ڵ�ż��֮�͡�

˼·: ����һ���ж�������С������һ��ż��֮�ͷ���  (for, ����, if)

����:
(1)���������϶������ֵ����Сֵint���ͱ���
(2)����һ��evensum����, ͨ��forѭ������, �ҳ���Сֵ�����ֵ��Χ������ż��, �����.

�ܽ�:
(1)����for��if��Ͽ���ɸѡ����Ҫ��Ԫ��.
*/

public class SumDemo
{
	//������
	public static void main(String[] args)
	{
		//������Сֵ
		int min = 1;
		//�������ֵ
		int max = 4;

		//���÷���
		int sum = SumDemo.evensum(min, max);
		System.out.println(sum);
	}


	//�жϴ�С(��ֹ�û����)
	static int[] swap(int min, int max)
	{
		//�½�����
		int[] arr = new int[2];
		if(min > max)
		{
			int temp = 0;
			temp = min;
			min = max;
			max = temp;
		}
		//����ֵ
		arr[0] = min;
		arr[1] = max;
		//����
		return arr;
	}

	//��ż��֮�ͷ���
	static int evensum(int min, int max)
	{
		//��ʼ���ܺͱ���
		int sum = 0;
		//�����ж���������С����
		int[] arr = SumDemo.swap(min, max);
		//����ż��֮��
		for(int count = arr[0]; count <= arr[1]; count++)
		{
			//�ж��Ƿ�Ϊż��
			if(count % 2 == 0)
			{
				sum = sum + count;
			}
		}
		//�����ܺ�
		return sum;
	}		
}