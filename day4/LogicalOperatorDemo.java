/*
����:��ʾ�߼������
����:
(1)�����
(2)�����
(3)ȡ������
(4)֤��&��&&������
(5)֤��|��||������

�ܽ�:
(1) &��&&����������&����������,�ұ߱��ʽ��һ������������. 
	��&&�ұ߱��ʽΪ��,�ұ߱��ʽ��������,�����ұ߱��ʽ����������
	|��||ͬ��
*/
public class LogicalOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(false && 1/0==1);  //false
		System.out.println(true || 1/0==1);   //true
		System.out.println("hello" + 7 + 8);  //hello78
	}
}