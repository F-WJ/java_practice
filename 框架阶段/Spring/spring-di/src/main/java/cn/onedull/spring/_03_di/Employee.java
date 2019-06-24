package cn.onedull.spring._03_di;

import java.math.BigDecimal;

public class Employee {
	private String name;
	private Integer age;
	private BigDecimal salary;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
