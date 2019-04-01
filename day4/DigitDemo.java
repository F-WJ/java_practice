/*
需求:定义一个int变量存放一个三位数的正数,分别求出百位数上的值,十位数上的值和个位数上的值
步骤:
(1)百位:利用除法
(2)十位:利用取余(%)和除法(/)
(3)个位:利用取余(%)

总结:
(1)int类型整除不会四舍五入
*/
public class DigitDemo
{
	public static void main(String[] args)
	{
		int a = 223;
		//百位
		int b = a / 100; 
		System.out.println(b);
		//十位
		int c = a % 100 / 10;
		System.out.println(c);
		//个位
		int d = a % 100 % 10;
		System.out.println(d);
	}
}