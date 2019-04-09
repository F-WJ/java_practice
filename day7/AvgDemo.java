/*
���󣺶���һ����������һ��int ���͵Ķ�ά���飬��������Ԫ��ƽ��ֵ(int ����)��
˼·��{{0,1,2}��{3,4}} �����0+1+2+3+4��/5 = 2
��Ҫʹ�õ��ķ���:  ��ά����, foreachѭ��,

����:
(1)�����������϶���һ��int���Ͷ�ά���鲢��̬��ʼ��
(2)ͨ��for+for���,Ƕ��ѭ��,���õ�����Ԫ��, �����
(3)����������������Ԫ���ܺ�, ������ƽ��ֵ

�ܽ�:
(1)ע�ⷽ��ʹ�ö�ά������Ϊ������ʱ��, ����[][]
*/
public class AvgDemo
{
	//������
	public static void main(String[] args)
	{
		//����һ����ά���鲢��̬��ʼ��
		int[][] arr = new int[][]{{0, 1, 2}, {3, 4}};
		//���÷���
		int average = AvgDemo.averagevalue(arr);
		System.out.println(average);
	}

	//������������ƽ��ֵ(int����)����
	static int averagevalue(int[][] arr)
	{
		//��ʼ�������ʹ���
		int sum = 0;
		int time = 0;
		
		for(int[] ele1 : arr)
		{
			for(int ele2 : ele1)
			{
				sum = sum + ele2;
				time ++;
			}
		}
		//����ƽ��ֵ
		return sum / time;
	}
}