/*
����:��ӡ[1,100]��������,����1,4,9....

����forѭ��

�ܽ�:
(1)for�ı���ֻ����for�����ʹ��
*/
public class SquareNumberDemo
{
	public static void main(String[] args)
	{
		for(int num = 1; num <= 100; num++)
		{
			if(num*num <= 100)
			{
				System.out.println(num*num);
			}
		}
	}
}