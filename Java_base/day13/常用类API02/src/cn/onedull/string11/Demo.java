/*
编写一个方法:
public int getAge(String text){// 按照 xxxx年xxx月xxxx日传入日期的字符串信息
//返回 到今天你多少岁了


思路: 使用Calender获取当前年月日来和text通过SimpleDateFormat格式化后的日期做对比

*/
package cn.onedull.string11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		String text = "1994年4月23日";
		int age = Demo.getAge(text);
		System.out.println(age);
	}
	
	static int getAge(String text) throws ParseException {
		Calendar c = Calendar.getInstance();
		//当前年
		int currentyear = c.get(Calendar.YEAR);
		//当前月
		int currentmouth = c.get(Calendar.MONTH) + 1;
		//当前日
		int currentdate = c.get(Calendar.DAY_OF_MONTH);
		
		//text
		SimpleDateFormat sf = new SimpleDateFormat();
		sf.applyPattern("yyyy年MM月dd日");
		Date date = sf.parse(text);
		sf.applyPattern("yyyy-MM-dd");
		int y = Integer.parseInt(sf.format(date).split("-")[0]);
		int m = Integer.parseInt(sf.format(date).split("-")[1]);
		int d = Integer.parseInt(sf.format(date).split("-")[2]);
		
		if(currentmouth == m && currentdate >= d) {
			int age = currentyear - y;
			return age;
		}else if(currentmouth == m && currentdate < d){
			int age = currentyear - y - 1;
			return age;
		}else if(currentmouth > m) {
			int age = currentyear - y;
			return age;
		}
		else {
			int age = currentyear - y - 1;
			return age;
		}
		
	}

}
