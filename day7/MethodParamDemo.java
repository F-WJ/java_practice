/*
������ʾ������������ֵ���ݻ��ƺ�������������ֵ���ݻ��Ƶ�����
���裺
��1�������������͵�ֵ���ݻ���
����һ���������ı�һ���������ͱ�����ֵ
��2��������������ֵ���ݻ���
����һ���������ı�һ�������е�һ��Ԫ�ص�ֵ
��3�����÷��������۲�ֵ֮�������
��4���뻭����������ֵ���ݵ��ڴ����ͼ
��5���뻭����������ֵ���ݵ��ڴ����ͼ

�ܽ�:
(1)����������ֵ���ݻ���Ϊ: ���ǻ������Ͳ���ʱ, ���ݵ��ǲ���ֵ, �����������Ͳ���ʱ.
	���ݵ��������õĶѿռ��ֵַ.
*/
public class MethodParamDemo
{
	static void change(int x)
	{
		x = 100;
	}

	static void change(int[] arr2)
	{
		arr2[0] = 30;	
	}

	public static void main(String[] args)
	{
		//�������Ͳ���
		int a = 10;
		System.out.println("before: " + a);
		//���÷���
		MethodParamDemo.change(a);
		System.out.println("end: " + a);

		//�������Ͳ���
		int[] arr1 = new int[]{10, 90};
		System.out.println("before: " + arr1[0]);
		//���÷���
		MethodParamDemo.change(arr1);
		System.out.println("end: " + arr1[0]);

	}
}