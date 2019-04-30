package cn.onedull.practice02;

public class Person {
	private String name;         //姓名
	private String address;      //地址
	
	public Person() {
		super();
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

//设计一个方法addSalary作为涨工资，普通员工一次能涨10％，经理能涨20％
//Person类中的属性有：姓名name(String类型)，地址address(String类型)，定义该类的构造方法； 