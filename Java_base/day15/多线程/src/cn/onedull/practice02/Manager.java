package cn.onedull.practice02;

public class Manager extends Employee{
	private String level;      //级别
	
	public Manager() {
		super();
	}

	public Manager(String level) {
		super();
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	//涨工资
	public void addSalary(double salary){
		System.out.println(getName() + ": " + (salary + (salary * 0.2)));
	}
}


//Manager类中的属性有：级别level(String类型)定义该类的构造方法；