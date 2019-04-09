/*
需求:
定义方法 打印指定字母之间的字母:
	传入 a d    打印 a b c d
	传入 d z    打印 d e f g ..... z

步骤:
(1)利用了ascll编码
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
		//转换为数字
		int j = b;
		//for
		String str = "";
		for(int i = a; i <= j; i++)
		{
			//强转char类型
			char c = (char)i;
			str = str + c + " ";
		}
	
		return str;
	}
}