package cn.onedull.student_class;

public class Student {
	private String name;
	private int age;
	
	public Student(){
		
	}
	public Student(String name, int age){
		this.name = name; //�������this, ���Ϊnull(û�и�ֵ�ɹ�)
		this.age = age;
	}
	
	//getter����
	public String getName(){
		return name;
	}
	
	//setter����
	public void setName(String n){
		name = n;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age; //this�ؼ���
	}
	
	
}
