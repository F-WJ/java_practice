/*
����:
���巽�� ��� ������ ��λ��:
���� 10  ���� 2λ��
���� 4321  ���� 4λ��

����:
(1)
*/

public class ExpandDemo3
{
	public static void main(String[] args)
	{
		int a = 100;
		int num = ExpandDemo3.getNum(a);
		System.out.println(num);
	}


	static int getNum(int a)
	{
		int count = 0;
		int num = 10;
		while(true)
		{
			a = a / num;
			if(a == 0)
			{
				count++;
				break;
			}
			else
			{
				count++;
			}
		}

		return count;
		
	}
}