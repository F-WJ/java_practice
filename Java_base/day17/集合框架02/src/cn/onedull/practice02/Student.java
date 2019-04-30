/*
姓名（name）、年龄（age）、成绩（score）、班级号
（classNum）
*/
package cn.onedull.practice02;

public class Student {
	//成员变量
	private String name;		//姓名
	private int age;			//年龄
	private int score;			//成绩
	private String classNum;	//班级号
	
	public Student() {
		super();
	}

	public Student(String name, int age, int score, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + ", classNum=" + classNum + "]";
	}
	
	
	
	
}
