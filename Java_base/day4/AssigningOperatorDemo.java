/*
����:��ʾ��ֵ�����
����:
(1)����һ��int���ͱ���age
(2)��ʾ"+="����,��age�����10
(3)����һ��short���ͱ���s
(4)��ʾ"+="����,��s�����2,��˵��"+="���ŵ�Ч��

�ܽ�:
(1)�˽�+=�ײ�ԭ��(�Զ�ǿ��ת����������������)
*/
public class AssigningOperatorDemo
{
	public static void main(String[] args)
	{
		//����һ��int���ͱ���
		int age = 18;
		System.out.println(age+=10);
		short s = 10;
		s+=2; // �ȼ��� s = (short)(s + 2);
		System.out.println(s);
	}
}