/*
���󣺶���һ�����������������ߣ��ж������εı�,�������������ȷ���1�����������
�ȷ���2����������0.

���õ��ļ���: if-elseif-else���

����:
(1)������������������int���ͱ���a, b, c , ��Ϊ������������
(2)�ڷ������������������ж�, һ�������߶����, һ�������߶������, ��������Ϊֻ���������.

�ܽ�:
(1)����������ò�����ɹ���
*/
public class JudgeTriangleDemo
{
	//�ж������η���
	static int trigon(int a, int b, int c)
	{
		if(a == b && a == c)
		{
			return 2;
		}
		else if(a != b && a != c && b != c)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
	//������
	public static void main(String[] args)
	{
		//���������ߵ���
		int a = 2;
		int b = 1;
		int c = 4;
		//���÷���
		int value = JudgeTriangleDemo.trigon(a, b, c);
		System.out.println(value);
	}


}