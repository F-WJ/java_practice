package cn.onedull.expand1;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
	private String name;            //����
	private int age;                //����
	private BigDecimal salary;      //����
	private Date hireDate;          //��ְʱ��
	
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
 * ��Employee ��name��String ���ͣ���age��int ���ͣ���salary��нˮ��BigDecimal ���ͣ���
 * hireDate����ְ������Date ���ͣ� �ĸ��ֶ��ҷ���JavaBean �淶 �����������Ķ����������У������1996
 * ��ǰ��ְ��Ա���ĵ�ƽ��н�ʡ�
 */
