/*
����:��ʾ���������
����:
(1)������������,�ֱ�����Ͳ����(+ - * /)
(2)ȡģ,������(%)
(3)��ʾ"+"�ű�ʾ���ӷ��ŵ�����
(4)��ʾ8765/1000*1000,˵�����Ϊʲô��8000
(5)��ʾ10/0,��˵������ԭ��
(6)��ʾǰ��++
(7)��ʾ����++

�ܽ�:
(1)ǰ��++�ͺ���++����: һ�������Ӻ�ʹ��,��һ����ʹ�ú�����
*/
public class ArithmeticOperatorsDemo1
{
	public static void main(String[] args)
	{
		//��������int���ͱ���
		int a = 2;
		int b = 4;
		//�ֱ��ӡ�Ӽ��˳���
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(b % a);
		System.out.println("Hello" + 18);
		System.out.println(8700/1000*1000);
		//System.out.println(10 / 0);  //����:ArithmeticException: / by zero ,���ܳ���0
		
		// ǰ��++�ͺ���++����
		int c1 = 2;
		int d1 = ++c1;
		System.out.println("d1 : " + d1);
		int c2 = 2;
		int d2 = c2++;
		System.out.println("d2 : " + d2);
	}
}