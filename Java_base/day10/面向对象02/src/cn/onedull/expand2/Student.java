package cn.onedull.expand2;

public class Student {
	private String name;
	private int age;
	//�γ�
	private Course course;
	
	public Student(){
		
	}
	
	//�вι�����
	public Student(String name, int age, Course course){
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public Course getCourse(){
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	void print() {
		System.out.println("ѧ������: " + name + " , " + "����: " + 
							age + " , " + "�γ�����: " + course.getName() + " , " + course.getName() + "�ɼ�: " + course.getScore());

	}
	
}
