package cn.onedull.practice2;

import java.util.Arrays;

public class Student {
	private int no;
	private String name;
	private int[] score;
	
	public Student() {
		
	}
	public Student(int no, String name, int[] score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	
	static void getAvg(Student[] stu) {
		//平均分
		for(int index = 0; index < stu.length; index++) {
			//student1类数组
			int sum = 0;
			for(int ele : stu[index].getScore()) {
				sum = ele + sum;
			}
			int average = sum / stu[index].getScore().length;
			System.out.println("学号 : " + stu[index].getNo());
			System.out.println("姓名 : " + stu[index].getName());
			System.out.println("成绩 : " + Arrays.toString(stu[index].getScore()));
			System.out.println("平均分 : " + average);
			System.out.println("------------------------");
		
		}	
	
	}
	
	//打印学生信息
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + Arrays.toString(score) + "]";
	}
	
	
}
/*
 * 功能：输出一位学生的数据内容(toString)、计算学生的平均分(getAvg)
 * 2)在main()方法中创建五个学生信息，并定义一个对象数组用于存储创建的五位学生 的数据，使用Student 类的getAvg
 * 方法计算出这些学生的平均分；并打印所有学生的信息。
 */
/*
1)请用javaBean 规范设计一个学生类Student，具有：
属性：no(学号)、name(姓名)和score(成绩)
 */
