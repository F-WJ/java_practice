/*
����:���� 100���ڵ���������
����:
(1)����һ������number,��ʾ����
(2)����һ������sum,��ʾǰN����֮��
(3)ʹ��whileѭ��,ÿѭ��һ��sum�͵�ǰ��number���һ��

�ܽ�:
(1)while��䵱boolean���ʽΪtrue��,ѭ���������
*/
public class WhileDemo3
{
	public static void main(String[] args)
	{
		//����int���ͱ���
		int number = 1;
		int sum = 0;

		while(number <= 100)
		{
			sum = sum + number;
			number++;
		}
		System.out.println(sum);
	}
}