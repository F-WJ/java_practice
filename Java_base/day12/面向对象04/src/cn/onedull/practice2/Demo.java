/*
������Ҫ���дһ������
1)����javaBean �淶���һ��ѧ����Student�����У�
���ԣ�no(ѧ��)��name(����)��score(�ɼ�)
���ܣ����һλѧ������������(toString)������ѧ����ƽ����(getAvg)
2)��main()�����д������ѧ����Ϣ��������һ�������������ڴ洢��������λѧ��
�����ݣ�ʹ��Student ���getAvg �����������Щѧ����ƽ���֣�����ӡ����ѧ������Ϣ��

����:
(1)����һ��Student��,  3��private���εĳ�Ա����no(ѧ��), name(����), score(�ɼ�),  
	������Ա����getAvg(ʹ��forѭ��������ÿһ��ѧ��ƽ����), 
	����ԭ��toString����,  �޸ĳɴ�ӡ����ѧ������Ϣ.
(2)����������Demo, ����Student����, ����Student����, ����getAvg����

�ܽ�:
(1)ͨ�����������������, ���԰����ж������Ϣ������һ��, ���㴦��һЩ����, ����ĳһ�ֶε����
*/

package cn.onedull.practice2;

public class Demo {

	public static void main(String[] args) {
		//��������
		int[] score1 = new int[]{80, 90, 60};
		Student student1 = new Student(1, "С��", score1);
		System.out.println(student1);
		int[] score2 = new int[]{80, 23, 60};
		Student student2 = new Student(2, "С��", score2);
		System.out.println(student2);
		int[] score3 = new int[]{80, 98, 60};
		Student student3 = new Student(3, "С��", score3);
		System.out.println(student3);
		int[] score4 = new int[]{80, 45, 60};
		Student student4 = new Student(4, "С��", score4);
		System.out.println(student4);
		int[] score5 = new int[]{80, 67, 60};
		Student student5 = new Student(5, "С��", score5);
		System.out.println(student5);
		
		//����һ��ѧ��������,����̬��ʼ��
		Student[] stu = new Student[]{student1, student2, student3, student4, student5};
		//����ÿһ��ѧ����ƽ����, ����ӡѧ������Ϣ
		Student.getAvg(stu);
		
	}
		
		

}

