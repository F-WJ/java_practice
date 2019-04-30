/*
需求：使用日期Date 类常用方法

步骤:
(1)创建Demo类, 在main方法中创建Date对象, 打印Date对象
(2)调用Date方法,

总结:
(1)大部分方法已经被弃用, 用的时候, 最好使用SimpleDateFormat类的方法, 或者 Calndar类的方法
*/

package cn.onedull.title04;

import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);	  //Thu Apr 18 03:15:32 CST 2019
		//本地区域格式
		System.out.println(d.toLocaleString());  //2019-4-18 3:16:14
		//返回自1970年1月1日以来，由此 Date对象表示的00:00:00 GMT的毫秒数
		System.out.println(d.getTime());
	} 

}
