package cn.odedull.practice1;
//有属性： 编号，姓名，年龄，工资，身份证号码，员工人数，员工工资总额
public class Staff {
	//编号
	private int code;					//编号
	private String name;				//姓名
	private int age;					//年龄
	private double salary;				//工资
	private int sn;						//身份证号码
	private int staffSum;               //员工人数
	static double staffSalarySum;      //员工工资总额

	//构造器
	public Staff() {
		
	}
	public Staff(int code, String name, int age) throws LowAgeException, HighAgeException{
		this.code = code;
		if(name == null || "".equals(name.trim())) {
			throw new NullPointerException("姓名不能为空或者null");
		}else {
			this.name = name;
		}
		if(age < 18) {
			throw new LowAgeException("年龄太低");
		}else if(age > 60) {
			throw new HighAgeException("年龄太高");
		}
		else {
			this.age = age;
		}
	}
	
	public void addSalary(double addSalary) {
		addSalary = addSalary + salary;
		if(addSalary > staffSalarySum) {
			throw new HighSalaryException("工资过高");
		}
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public int getStaffSum() {
		return staffSum;
	}
	public void setStaffSum(int staffSum) {
		this.staffSum = staffSum;
	}
	
}


/*
 * 编写一个员工类： 
 * (1) 有属性： 编号，姓名，年龄，工资，身份证号码，员工人数，员工工资总额
 * (2) 有构造器：构造器：设置编号，年龄，姓名；如果年龄小于18，抛出年龄低异常，
如果年龄大于60 抛 出年龄高异常，如果姓名为null 或为空字符串，抛出空异常。
 * (3)有方法 增加工资addSalary(double addSalary)，声明抛出工资高异常，
 * 当增加后的工资大于员工工 资总额时，抛出此异常。
 */