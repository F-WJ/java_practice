/*
需求：查询某个时间最近一周的信息，如何表示最近这一周的开始时间和结束时间

步骤:
(1)创建Calendar对象, 调用set方法, 修改值
(2)调用add方法,  修改时间
(3)打印开始时间和7天前的时间

总结:
(1)Calendar可以通过add或者set来修改时间, set修改的值, 而add是通过增加值来修改
*/

package cn.onedull.title07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		String str = "2019-04-18 03:55:30";
		SimpleDateFormat sf = new SimpleDateFormat();
		//解析操作
		sf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date d = sf.parse(str);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		// 小时
		c.set(Calendar.HOUR_OF_DAY, 23);
		//分钟
		c.set(Calendar.MINUTE, 59);
		//秒
		c.set(Calendar.SECOND, 59);
		Date end = c.getTime();
		System.out.println("结束时间: " + end.toLocaleString());
		
		//设置日
		c.add(Calendar.DAY_OF_MONTH, -7);
		c.add(Calendar.SECOND, 1);
		Date begin = c.getTime();
		System.out.println("开始时间: " + begin.toLocaleString());
	}

}
