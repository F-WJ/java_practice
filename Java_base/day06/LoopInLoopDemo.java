/*
����:���ֱ��������
˼·:
(1) ��򵥷�ʽ:  ���д�ӡ
(2) ʹ��Ƕ��ѭ��

Ƕ�׹���:
(1)����for��ʾΪÿһ��
(2)����for��ʾÿһ��Ҫ��ӡ������

�ܽ�:
(1)Ƕ��ѭ��: ���ĳһ����Ҫ�ظ�ִ��, ���һ���ظ��Ĳ�����Ҫ��N�ε�ʱ��, ��������Ƕ��ѭ��, ����: for(){ for(){} }
*/
public class LoopInLoopDemo
{
	public static void main(String[] args)
	{
		//ɵB��ʽ
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");

		System.out.println("---------------");
		
		
		//��ͨ��ʽ
		//��һ��
		int line = 1;
		for(int i = 1; i <= line; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		//�ڶ���
		line = 2;
		for(int i = 1; i <= line; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		//������
		line = 3;
		for(int i = 1; i <= line; i++)
		{
			System.out.print("*");	
		}
		System.out.println();
		System.out.println("---------------");
		
		//����Ƕ��ѭ��
		for(int num = 1;num <= 3;num++)
		{
			for(int num2 = 1; num2 <= num;num2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}