/*
���󣺶���һ����������ӡָ�������е�ָ���ַ���
���裺
��1�����巽��
��2��ʵ�ַ�����
��3�����÷���

�ܽ�:
(1)û�з���ֵ,��������ʹ��void
*/
public class MethodDemo2
{
	static void print(int line, String str)
	{
		for(int i = 1; i <= line; i++)
		{
			System.out.println(str);
		}
	}

	public static void main(String[] args)
	{
		//����print����
		MethodDemo2.print(3, "���");
	}
}