package cn.onedull.practice01;

public class Student {
	private String name;  //����
	private int age;      //����
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
		System.out.println("��ѧ��������" + name + ", " + "����: "+ age + ", "  + "�γ����ƣ�"+ course.getCourse() + "���ĳɼ���"+ course.getScore());
	}
	
}



/*
 * ����ѧ�����к���һ�ſγ̣�����ѧ��������������������Ա������
 * �γ����к��пγ����ơ��ɼ��� ��������ѧ���γ���Ϣ��
 */