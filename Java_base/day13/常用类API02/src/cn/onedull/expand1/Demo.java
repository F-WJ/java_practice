/*给一个字符串name= 小红&age=17&salary=8000.00&hireDate=1991-07-03;name= 小明
&age=23&salary=10000.00&hireDate=1992-12-11;name= 小白
&age=18&salary=12000.00&hireDate=1996-01-09，
请把字符串中的数据封装到Employee 的对象中，
类Employee 有name（String 类型）、age（int 类型）、salary（薪水是BigDecimal 类型）、
hireDate（入职日期是Date 类型） 四个字段且符合JavaBean 规范
把三个创建的对象存放数组中，求出在1996 年前入职的员工的的平均薪资。*/
package cn.onedull.expand1;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		//String类
		String name = "name= 小红&age=17&salary=8000.00&hireDate=1991-07-03;name= 小明&age=23&salary=10000.00&hireDate=1992-12-11;name= 小白&age=18&salary=12000.00&hireDate=1996-01-09";
		//Employee数组
		Employee[] e = new Employee[3]; 
		String[] str = name.split(";");
		for(int i= 0; i< str.length; i++) {
			String[] str2 = str[i].split("&");
			//创建对象
			Employee emp = new Employee();
			emp.setName(str2[0].substring(str2[0].indexOf("=") + 1).trim());
			emp.setAge(Integer.parseInt(str2[1].split("=")[1].trim()));
			emp.setSalary(new BigDecimal(str2[2].split("=")[1].trim()));
	
			//创建日期格式
			SimpleDateFormat sf = new SimpleDateFormat();
			sf.applyPattern("yyyy-MM-dd");
			emp.setHireDate(sf.parse(str2[3].split("=")[1].trim()));
			e[i] = emp;	
		}
		
		//求出在1996 年前入职的员工的的平均薪资。
		BigDecimal sum = new BigDecimal("0");
		BigDecimal time = new BigDecimal("0");
		for(Employee ele : e) {
			SimpleDateFormat sf = new SimpleDateFormat();
			sf.applyPattern("yyyy");
			if(Integer.parseInt(sf.format(ele.getHireDate())) < 1996){
				sum = sum.add(ele.getSalary());
				time = time.add(new BigDecimal("1"));
			}
		}
		System.out.println(sum.divide(time));
		
		
		
		
		
	}

}
