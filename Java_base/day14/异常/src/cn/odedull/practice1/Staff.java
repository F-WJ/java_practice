package cn.odedull.practice1;
//�����ԣ� ��ţ����������䣬���ʣ����֤���룬Ա��������Ա�������ܶ�
public class Staff {
	//���
	private int code;					//���
	private String name;				//����
	private int age;					//����
	private double salary;				//����
	private int sn;						//���֤����
	private int staffSum;               //Ա������
	static double staffSalarySum;      //Ա�������ܶ�

	//������
	public Staff() {
		
	}
	public Staff(int code, String name, int age) throws LowAgeException, HighAgeException{
		this.code = code;
		if(name == null || "".equals(name.trim())) {
			throw new NullPointerException("��������Ϊ�ջ���null");
		}else {
			this.name = name;
		}
		if(age < 18) {
			throw new LowAgeException("����̫��");
		}else if(age > 60) {
			throw new HighAgeException("����̫��");
		}
		else {
			this.age = age;
		}
	}
	
	public void addSalary(double addSalary) {
		addSalary = addSalary + salary;
		if(addSalary > staffSalarySum) {
			throw new HighSalaryException("���ʹ���");
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
 * ��дһ��Ա���ࣺ 
 * (1) �����ԣ� ��ţ����������䣬���ʣ����֤���룬Ա��������Ա�������ܶ�
 * (2) �й������������������ñ�ţ����䣬�������������С��18���׳�������쳣��
����������60 �� ��������쳣���������Ϊnull ��Ϊ���ַ������׳����쳣��
 * (3)�з��� ���ӹ���addSalary(double addSalary)�������׳����ʸ��쳣��
 * �����Ӻ�Ĺ��ʴ���Ա���� ���ܶ�ʱ���׳����쳣��
 */