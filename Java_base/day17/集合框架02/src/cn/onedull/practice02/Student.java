/*
������name�������䣨age�����ɼ���score�����༶��
��classNum��
*/
package cn.onedull.practice02;

public class Student {
	//��Ա����
	private String name;		//����
	private int age;			//����
	private int score;			//�ɼ�
	private String classNum;	//�༶��
	
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
