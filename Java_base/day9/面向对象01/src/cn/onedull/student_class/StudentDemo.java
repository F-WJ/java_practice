/*
������ΪStudentDemo ��Ͷ���Ĳ�����
���裺
Student��
(1)ѧ�������������������ֶ�
(2)����JavaBean �淶

StudentDemo��
(1)����ѧ������
(2)ʹ��setter ��������ֵ
(3)��ȡ�����Ա������ֵ
(4)ͨ���в�����������������ʹ��setter �����޸�ֵ

�ܽ�:
(1)JavaBean�淶: �����ʹ��public����, ���뱣֤���޲���������, 
     �ֶ�(��Ա����)ʹ��private, ÿһ���ֶ��ṩgetter��setter����.

 */
package cn.onedull.student_class;

public class StudentDemo {

	public static void main(String[] args) {
		//����student����
		Student student = new Student();
		
		//ͨ��getter������ȡ��Ա������ֵ
		//student.setName("С��");
		String name = student.getName();
		System.out.println(name);
		
		//ʹ�ô���������������student2����
		Student student2 = new Student("С��", 2);
		System.out.println(student2.getName() + " , " + student2.getAge());
		
		//ͨ��setter�����޸�
		student2.setName("С��");
		student2.setAge(4);
		System.out.println(student2.getName() + " , " + student2.getAge());
			

	}

}
