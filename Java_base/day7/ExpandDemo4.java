/*
����:
���巽�� ��ӡָ����ĸ֮�����ĸ:
	���� a d    ��ӡ a b c d
	���� d z    ��ӡ d e f g ..... z

����:
(1)������ascll����
*/
public class ExpandDemo4
{
	public static void main(String[] args)
	{
		char a = 'a';
		char b = 'z';

		String print = ExpandDemo4.printLetter(a, b);
		System.out.println(print);
	}
	
	static String printLetter(char a, char b)
	{
		//97 ~ 122 a ~ z
		//ת��Ϊ����
		int j = b;
		//for
		String str = "";
		for(int i = a; i <= j; i++)
		{
			//ǿתchar����
			char c = (char)i;
			str = str + c + " ";
		}
	
		return str;
	}
}