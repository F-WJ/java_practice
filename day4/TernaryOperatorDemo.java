/*
����:��ʾ��Ԫ�����
����:
(1)�ж�һ����99�ǲ���ż��,����ӡ���
(2)���99��20֮�������һ��ֵ,����ӡ���
(3)һ����55������,ÿҳ��ʾ10������,����һ���ֶ���ҳ


�ܽ�:
(1)��Ԫ������������������������Ҫ��ͬ
(2)��������ɽ��������
*/
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		int a = 99;
		//ͨ��a��2�������Ƿ�Ϊ0���ж�
		String result = a % 2 == 0 ? "ż��" : "����";
		System.out.println(result);
		
		//������
		int data = 55;
		//ÿҳ��������
		int pages = 10;
		//ͨ����ҳ����ÿҳ�������������Ƿ�Ϊ0���ж���ҳ���Ƿ���Ҫ��1
		int result1 = data % pages == 0 ? data / pages : data/pages+1;
		System.out.println(result1);

	}
}