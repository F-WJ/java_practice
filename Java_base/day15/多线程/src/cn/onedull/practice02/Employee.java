package cn.onedull.practice02;

public class Employee extends Person{
	private String id;         //����
	private double salary;     //����
	private int age;           //����
	
	
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
	
	
	//�ǹ���
	public void addSalary(double salary){
		System.out.println(getName() + ": " + (salary + (salary * 0.2)));
	}
	
	
}


//Employee���е������У�����id(String��)������salary(double����)������(int��)���������Ĺ��췽����