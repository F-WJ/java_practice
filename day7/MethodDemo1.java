/*
���󣺶�������������֮�͵ķ���
���裺
��1�����巽��
ȷ�������������η�����ʱʹ��static��
ȷ���Ƿ���Ҫ��ʽ����
ȷ���Ƿ���Ҫ����
��2�����÷���
ȷ�������﷨����ʱ�������÷�����
ȷ����Ҫ����ʲôʵ�ʲ���
ȷ���Ƿ���Ҫ����������շ���ֵ

�ܽ�:
(1)ʵ�ʲ�������һ��Ҫ���β�����һ��
*/
public class MethodDemo1
{
	static int getSum(int a, int b)
	{
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args)
	{
		//����getSum����
		int sum = MethodDemo1.getSum(2, 3);
		System.out.println(sum);
	}
}