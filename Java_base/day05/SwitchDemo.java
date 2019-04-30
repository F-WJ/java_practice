/*
需求:使用switch来完成,根据输入的一个数字,判断是星期几
步骤:
(1)定义一个整数类型的变量weekday
(2)判断变量weekday,如果weekday为1输出"周一",如此类推

总结:
(1)switch转换的整数类型只能是byte,short,char,int, 不能是long
(2)case表示执行代码入口, 一旦进入case,代码会一直执行, 知道遇到break, return,或者知道switch结束才停止.
*/
public class SwitchDemo
{
	public static void main(String[] args)
	{
		int weekday = 9;

		switch(weekday)
		{
			case 1 : System.out.println("周一"); break;
			case 2 : System.out.println("周二"); break;
			case 3 : System.out.println("周三"); break;
			case 4 : System.out.println("周四"); break;
			case 5 : System.out.println("周五"); break;
			case 6 : System.out.println("周六"); break;
			case 7 : System.out.println("周日"); break;
			default:
				System.out.println("请输入数字1~7"); break;
		}
	}
}