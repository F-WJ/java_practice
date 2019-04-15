/*
���󣻶���һ����������������������һ��double �����ʾ�����Ʒ�ļ۸�һ��double
���͵��ۿۣ����ػ�Ʒ�ܼ۸�
���裺
��1������totalPrice������ʹ��������Ϊ����price��discount(double)
��2�����巽����ʹ�ÿɱ������Ϊ����
��3��������������

�ܽ�:
(1)��ʹ��return��ʱ��, �����ķ�������Ҫ�ͷ���ֵ������һ��
(2)ʹ�ÿɱ����, �����Ƿ������������һ��
*/
public class VarArgsDemo
{
	static double totalPrice(double[] price, double discount)
	{
		//����
		double total = 0;
		//for
		for(double ele : price)
		{
			total = total + ele;
		}
		return total * discount;
	}

	//ʹ�ÿɱ����
	static double totalPrice(double discount, double... price)
	{
		double total = 0;
		for(double ele : price)
		{
			total = total + ele;
		}
		return total * discount;
	}

	public static void main(String[] args)
	{
		//��������
		double[] price = new double[]{10.0, 20.0};
		//�ۿ۱���
		double discount = 0.8;
		//���÷���
		double a = VarArgsDemo.totalPrice(price, discount);
		//ʹ���˿ɱ�����ķ���
		double b = VarArgsDemo.totalPrice(0.8, 10.0, 20.0);
		System.out.println(a);
		System.out.println("------------");
		System.out.println(b);
		
	}
}