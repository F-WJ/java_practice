package cn.onedull.practice01;

public class Student {
	private String name;  //姓名
	private int age;      //年龄
	private Course course;
	public Student() {
		
	}
	public Student(String name, int age, Course course) {
		this.name = name;
		this.age = age;
		this.course = course;
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
	public void setCourse(Course course) {
		this.course = course;
	}
	
	void print() {
		System.out.println("·学生姓名：" + name + ", " + "年龄: "+ age + ", "  + "课程名称："+ course.getCourse() + "语文成绩："+ course.getScore());
	}
	
}



/*
 * 其中学生类中含有一门课程，还有学生姓名、年龄这两个成员变量。
 * 课程类中含有课程名称、成绩。 给出以下学生课程信息表：
 */