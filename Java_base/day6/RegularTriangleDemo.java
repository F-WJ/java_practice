/*
����:��ӡ��������

˼·:
(1)����(����)1,3,5,7,9, ʹ�ù�ʽ2*ÿһ��-1
(2)�ո��������� - �ڼ���

����:
(1)�ȶ�������������
(2)ͨ��for��whileǶ��ѭ��

�ܽ�:
(1)��ʵ��for+for����Ƕ�����Ҳ����

*/
public class RegularTriangleDemo
{
	public static void main(String[] args)
	{
		int num = 5;
		for(int line = 1; line <= num; line++)
		{
			int blank = 1;
			int star = 1;
			while(blank <= num-line)
			{
				System.out.print(" ");
				blank++;
			}
			while(star <= 2*line-1)
			{
				System.out.print("*");
				star++;
			}
			System.out.println();
		}
		
	}
}