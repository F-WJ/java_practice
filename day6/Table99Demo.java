/*
����:��ӡ�žų˷���

����(����Ƕ��ѭ��):
(1)��forѭ��, ��ѭ��1��9����
(2)��forѭ��,ѭ����1��ÿһ����ѭ���ı�����ֵ,����ѭ��������ֵ*��ѭ��������ֵ

�ܽ�: ��ѭ����, ���ظ�ѭ���������ʱ��,��������for(){ for(){} }Ƕ��ѭ��
*/

public class Table99Demo
{
	public static void main(String[] args)
	{
		//ɵB��ʽ
		System.out.println("1*1=1");
		System.out.println("1*2=2 2*2=4");
		System.out.println("1*3=3 2*3=6 3*3=9");
		System.out.print("\n" + "----------------------" + "\n");
		//��ͨ��ʽ
		//��һ��
		int line = 1;
		for(int i = 1; i <= line; i++)
		{
			System.out.print(i + "*" + line + "=" + i * line);
		}
		System.out.println();
		//�ڶ���
		line = 2;
		for(int i = 1; i <= line; i++)
		{
			System.out.print(i + "*" + line + "=" + i * line + " ");
		}
		System.out.println();
		//������
		line = 3;
		for(int i = 1; i <= line; i++)
		{
			System.out.print(i + "*" + line + "=" + i * line + " ");
		}
		System.out.print("\n" + "----------------------" + "\n");
		
		//��ѭ��
		for(int x = 1;x <= 9; x++)
		{
			//��ѭ��
			for(int y = 1;y <= x; y++)
			{
				System.out.print(y + "*"+ x + "=" + (x * y)+ "\t");
			}
			System.out.println();
		}
	}
}