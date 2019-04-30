package cn.onedull.practice02;

public class Employee extends Person{
	private String id;         //工号
	private double salary;     //工资
	private int age;           //工龄
	
	
	public Employee() {
		super();
	}
	public Employee(String id, double salary, int age) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//涨工资
	public void addSalary(double salary){
		System.out.println(getName() + ": " + (salary + (salary * 0.2)));
	}
	
	
}


//Employee类中的属性有：工号id(String型)，工资salary(double类型)，工龄(int型)，定义该类的构造方法；