/*
需求:
定义一个int类型变量存放当前月份(mouth),使用switch进行判断,例如3月份到5月份是打印春季,
6月到8月打印夏季,依次类推打印秋季和冬季,但月份不是1月份到12月份,打印月份非法.

总结:
(1)利用switch语句中的当进入case后, 代码会一直执行, 直到遇到break才停止(穿透现象), 
	如果出现重复性语句体,可以使用此方法.
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
			case 5 : System.out.println("春季"); break;
			case 6 : ;
			case 7 : ;
			case 8 : System.out.println("夏季"); break;
			case 9 : ;
			case 10: ;
			case 11: System.out.println("秋季"); break;
			case 12: ;
			case 1 : ;
			case 2 : ;System.out.println("冬季"); break;

			default:
				System.out.println("请输入数字1~12之内");
		}
	}
}