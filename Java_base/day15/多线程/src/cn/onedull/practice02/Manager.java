package cn.onedull.practice02;

public class Manager extends Employee{
	private String level;      //����
	
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
	
	//�ǹ���
	public void addSalary(double salary){
		System.out.println(getName() + ": " + (salary + (salary * 0.2)));
	}
}


//Manager���е������У�����level(String����)�������Ĺ��췽����