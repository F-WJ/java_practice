/*
 * ����
 * ��main ������ʵ�����¹��ܲ���ӡ�����һ���100 �׸߶��������£�ÿ����غ�
 * ������ԭ�߶ȵ�һ�룻�����£������ڵ�10 �����ʱ�������������ף���10 �η�����ߣ�
 * 
 * ����:
 * (1)�����������sum, ��ǰ�����߶�high, ��������time
 * (2)����forѭ��
 * 
 * �ܽ�:
 * (1)ע�������������Ϊ����, ��ʹ��double����
 */
package cn.wolfcode.array;

public class FallDemo {
	public static void main(String[] args)
	{
		//����
		double sum = 0;
		//����
		double high = 100;
		//����
		int time = 3;
		for(int i = 1; i <= time; i++)
		{
			high = high / 2;
			sum = 100.0 + sum + high;
		}
		System.out.println("��ǰ�����߶�: " + high);
		System.out.println("�ܸ߶�: " + sum);
	}
}
