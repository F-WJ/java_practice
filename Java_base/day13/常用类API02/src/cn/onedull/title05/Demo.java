/*
需求：通过SimpleDateFormat 类进行格式化和解析操作
步骤:
(1)创建一个Date对象和SimpleDateFormat对象
(2)利用format方法, 格式化日期, 修改成自定义日期模式
(3)利用parse方法, 解析字符串化的日期, 转换成Date类型

总结:
(1)Date类型转String类型, 为格式化操作(format)
(2)String类型转Date类型, 为解析操作(parse)
*/
package cn.onedull.title05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat();
		//设置日期模板
		sf.applyPattern("yyyy-MM-dd HH:mm:ss");
		//格式化操作
		String str = sf.format(d);
		System.out.println(str);  //2019-04-18 03:28:49
		//解析操作
		Date d2 = sf.parse(str);
		System.out.println(d2);   //Thu Apr 18 03:31:04 CST 2019
	}

}
