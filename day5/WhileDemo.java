/*
����:ʹ��whileѭ��,��ӡ10��˧��
����:
(1)����һ������count,��ʾ������
(2)ʹ��whileѭ��,�ж�count�Ƿ�С��10
(3)��ӡ"˧��"��ѭ������
(4)������+1

�ܽ�:
(1)while�﷨: while(boolean���ʽ){ ѭ���� }
*/
public class WhileDemo
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int count = 0;

		while(count < 10)
		{
			System.out.println("˧��");
			count += 1;
		}
	}
}