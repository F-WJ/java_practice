/*
需求:根据输入的一个数字,判断是星期几?
步骤:
(1)定义一个整数类型的变量weekday
(2)判断变量weekday,如果weekday为1输出"周一",如此类推

总结:
(1)if-else-else语句如果前面boolean都为false, 运行最后一个语句体
*/
public class IfElseIfElseDemo2
{
	public static void main(String[] args)
	{
		//定义int类型变量
		int weekday = 9;
		
		if(weekday == 1)
		{
			System.out.println("周一");
		}
		else if(weekday == 2)
		{
			System.out.println("周二");
		}
		else if(weekday == 3)
		{
			System.out.println("周三");
		}
		else if(weekday == 4)
		{
			System.out.println("周四");
		}
		else if(weekday == 5)
		{
			System.out.println("周五");
		}
		else if(weekday == 6)
		{
			System.out.println("周六");
		}
		else if(weekday == 7)
		{
			System.out.println("周日");
		}
		else
		{
			System.out.println("请输入数字1~7之内的数字");
		}
	}
}