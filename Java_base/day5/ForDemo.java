/*
����:��ʾfor����ʹ��
����:
(1)ʹ��forѭ����ӡ1��10
(2)ʹ��forѭ������100����������֮��

�ܽ�:
(1)for�﷨: for(��ʼ�����;boolean���ʽ;ѭ����������){ ѭ���� }
(2)for�ﶨ��ı���ֻ����for����ʹ��
*/
public class ForDemo
{
	public static void main(String[] args)
	{
		//ѭ����ӡ1��10
		for(int num = 1; num <= 10; num++)
		{
			System.out.println(num);
		}

		System.out.println("---------------------------");
		
		//����forѭ������100����������֮��
		int sum = 1;
		for(int num = 1;num <= 100;num++)
		{
			sum = num + sum;
		}
		System.out.println(sum);
	}
}