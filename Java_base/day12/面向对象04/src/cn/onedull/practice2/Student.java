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
		//ƽ����
		for(int index = 0; index < stu.length; index++) {
			//student1������
			int sum = 0;
			for(int ele : stu[index].getScore()) {
				sum = ele + sum;
			}
			int average = sum / stu[index].getScore().length;
			System.out.println("ѧ�� : " + stu[index].getNo());
			System.out.println("���� : " + stu[index].getName());
			System.out.println("�ɼ� : " + Arrays.toString(stu[index].getScore()));
			System.out.println("ƽ���� : " + average);
			System.out.println("------------------------");
		
		}	
	
	}
	
	//��ӡѧ����Ϣ
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + Arrays.toString(score) + "]";
	}
	
	
}
/*
 * ���ܣ����һλѧ������������(toString)������ѧ����ƽ����(getAvg)
 * 2)��main()�����д������ѧ����Ϣ��������һ�������������ڴ洢��������λѧ�� �����ݣ�ʹ��Student ���getAvg
 * �����������Щѧ����ƽ���֣�����ӡ����ѧ������Ϣ��
 */
/*
1)����javaBean �淶���һ��ѧ����Student�����У�
���ԣ�no(ѧ��)��name(����)��score(�ɼ�)
 */
