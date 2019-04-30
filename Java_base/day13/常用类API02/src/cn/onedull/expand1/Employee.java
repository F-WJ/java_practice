package cn.onedull.expand1;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
	private String name;            //名字
	private int age;                //年龄
	private BigDecimal salary;      //工资
	private Date hireDate;          //入职时间
	
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}
	public Employee(String name, int age, BigDecimal salary, Date hireDate) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
}

/*
 * 类Employee 有name（String 类型）、age（int 类型）、salary（薪水是BigDecimal 类型）、
 * hireDate（入职日期是Date 类型） 四个字段且符合JavaBean 规范 把三个创建的对象存放数组中，求出在1996
 * 年前入职的员工的的平均薪资。
 */
