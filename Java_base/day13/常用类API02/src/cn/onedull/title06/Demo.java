/*
需求：创建Calendar 对象，并分别设置和获取日期的年、月、日、时、分、秒。
作业目的：掌握Calendar 对象的创建，简单的设置和获取日期信息。

步骤:
(1)创建Calendar对象, 
(2)通过get方法, 打印年, 月, 日, 时, 分, 秒

总结:
(1)获取的值都是int类型
*/
package cn.onedull.title06;

import java.util.Calendar;

public class Demo {

	public static void main(String[] args) {
		//创建对象
		Calendar c = Calendar.getInstance();
		//获取年
		System.out.println(c.get(Calendar.YEAR));    //2019
		//获取月
		System.out.println(c.get(Calendar.MONTH));   //3
		//获取日
		System.out.println(c.get(Calendar.DAY_OF_MONTH));  //18
		//获取时
		System.out.println(c.get(Calendar.HOUR_OF_DAY));   //3
		//获取分
		System.out.println(c.get(Calendar.MINUTE));        //47
		//获取秒
		System.out.println(c.get(Calendar.SECOND));        //16
		//获取星期几
		System.out.println(c.get(Calendar.DAY_OF_WEEK));        //5
		
		int minMonth = c.getActualMinimum(Calendar.MONTH);
		System.out.println("minMonth = " + minMonth);
		System.out.println("\\n");
	


		
	}

}
