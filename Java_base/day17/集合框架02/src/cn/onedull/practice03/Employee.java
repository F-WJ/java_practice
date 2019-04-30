package cn.onedull.practice03;

public class Employee {
	//成员变量
	private String name;   //姓名
	private int age;	   //年龄
	
	//无参构造器
	public Employee() {
		super();
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	

	
}
