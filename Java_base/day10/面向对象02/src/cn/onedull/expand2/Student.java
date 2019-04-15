package cn.onedull.expand2;

public class Student {
	private String name;
	private int age;
	//课程
	private Course course;
	
	public Student(){
		
	}
	
	//有参构造器
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
		System.out.println("学生姓名: " + name + " , " + "年龄: " + 
							age + " , " + "课程名称: " + course.getName() + " , " + course.getName() + "成绩: " + course.getScore());

	}
	
}
