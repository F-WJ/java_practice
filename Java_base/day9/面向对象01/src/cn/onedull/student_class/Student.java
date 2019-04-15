package cn.onedull.student_class;

public class Student {
	private String name;
	private int age;
	
	public Student(){
		
	}
	public Student(String name, int age){
		this.name = name; //如果不用this, 结果为null(没有赋值成功)
		this.age = age;
	}
	
	//getter方法
	public String getName(){
		return name;
	}
	
	//setter方法
	public void setName(String n){
		name = n;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age; //this关键字
	}
	
	
}
