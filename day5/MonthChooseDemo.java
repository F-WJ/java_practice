/*
����:
����һ��int���ͱ�����ŵ�ǰ�·�(mouth),ʹ��switch�����ж�,����3�·ݵ�5�·��Ǵ�ӡ����,
6�µ�8�´�ӡ�ļ�,�������ƴ�ӡ�＾�Ͷ���,���·ݲ���1�·ݵ�12�·�,��ӡ�·ݷǷ�.

�ܽ�:
(1)����switch����еĵ�����case��, �����һֱִ��, ֱ������break��ֹͣ(��͸����), 
	��������ظ��������,����ʹ�ô˷���.
*/

public class MonthChooseDemo
{
	public static void main(String[] args)
	{
		int month = 2;

		switch(month)
		{
			case 3 : ;
			case 4 : ;
			case 5 : System.out.println("����"); break;
			case 6 : ;
			case 7 : ;
			case 8 : System.out.println("�ļ�"); break;
			case 9 : ;
			case 10: ;
			case 11: System.out.println("�＾"); break;
			case 12: ;
			case 1 : ;
			case 2 : ;System.out.println("����"); break;

			default:
				System.out.println("����������1~12֮��");
		}
	}
}