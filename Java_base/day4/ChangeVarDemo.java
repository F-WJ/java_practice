/*
����:��������������ֵ
����:
(1)����һ������num1,����ֵΪ10
(2)����һ������num2,����ֵΪ50
(3)����һ������temp,��Ϊһ����ʱ����
(4)ʹ��temp��������num1��num2��ֵ,ʹnum1=50, num2=10
	��num1����temp,
	��num2����num1,
	��temp����num2.


�ܽ�: ���Ըı䳣��ֵ,ǰ������Ҫ�Ѿ������������͵ķ�Χ֮��
*/

public class ChangeVarDemo
{
	public static void main(String[] args)
	{
		//����num1,num2, temp����
		int num1 = 50;
		int num2 = 10;
		int temp;
		
		// num1��ֵ��temp
		temp = num1;
		//num2��ֵ��temp
		num1 = num2;
		//temp��ֵ��num2
		num2 = temp;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}