/*
��������Ķ�̬��ʼ�����ڴ����
���裺
��1����̬��ʼ�����飬����ӡ���鳤��
��2�����³�ʼ�����飬����ӡ���鳤��
��3������ֽ�ϻ������ϴ�����ڴ����ͼ

�ܽ�:
(1)��̬��ʼ���﷨: ����Ԫ������[] ������ = new ����Ԫ������[length], lengthΪ���鳤��
*/

public class ArrayDemo2
{
	public static void main(String[] args)
	{
		//��̬��ʼ������
		int[] arr = new int[4];
		//��ӡ���鳤��
		int size = arr.length;
		System.out.println(size);
		//���³�ʼ��
		arr = new int[3];
		//��ӡ���鳤��
		size = arr.length;
		System.out.println(size);

	}
}