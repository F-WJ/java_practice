/*
����:�붨��һ���������͵ı���sc,����С���ķ���,��дһ�γ����жϲ���ӡС���ɼ��Ƿ�ϸ�
����:
(1)���sc>=60,����"�ϸ�",���߷���"���ϸ�"
(2)��ӡ�������

�ܽ�: 
(1)��Ԫ���������ı�������Ҫ�ͽ��������һ��
*/
public class ScoreDemo
{
	public static void main(String[] args)
	{
		// ����һ��int���ͱ���
		int sc = 70;
		String result = sc>=60  ? "�ϸ�" : "���ϸ�";
		System.out.println(result);
	}
}