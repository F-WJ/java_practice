/*
����:��ʾdo while����ʹ��
����:
(1)ʹ��do whileѭ����ӡ500��"˧��"
(2)ʹ��do whileѭ�����100���ڵ�������֮��

�ܽ�:
(1)do-while: ���жϺ�����ѭ����
*/
public class DoWhileDemo2
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int number = 1;
		
		//ѭ����ӡ500��
		do
		{
			System.out.println("˧��");
			number++;
		}
		while (number <= 500);
		
		int a = 1;
		int sum = 0;
		
		//���100���ڵ�������֮��
		do
		{
			sum = sum + a;
			a++;
		}
		while(a <= 100);
		System.out.println(sum);
		
	}
}