/*
5:String[] arr = {"1990-1-1","2009-1-5","2019-5-7"};
 将arr中时间信息转换成 Date的 时间对象.保存在对应的数组中.
 
思路:
(1)先创建一个Date类型数组, 用来存放Date类型数据
(2)利用for循环加SimpleDateFormat类来把字符串转换成Date类型

总结:
(1)通过SimpleDateFormat来做日期的转换
*/
package cn.onedull.string05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		//创建String对象
		String[] arr = {"1990-1-1","2009-1-5","2019-5-7"};
		Date[] date = new Date[arr.length];
		for(int i = 0; i < arr.length; i++) {
			SimpleDateFormat sf = new SimpleDateFormat();
			sf.applyPattern("yyyy-MM-dd");
			date[i] = sf.parse(arr[i]);
			
		}
		//打印
		System.out.println(Arrays.deepToString(date));
	}

}
