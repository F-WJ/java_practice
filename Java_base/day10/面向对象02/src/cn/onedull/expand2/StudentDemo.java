/*
�ֱ𴴽�ѧ���ࣨStudent���Ϳγ��ࣨCourse��������ѧ�����к���һ�ſγ̣�����ѧ����
����������������Ա�������γ����к��пγ����ơ��ɼ���
��������ѧ���γ���Ϣ��
��ѧ����������С��������:14,�γ����ƣ����ģ����ĳɼ���88
��ѧ�����������ɣ�����:15,�γ����ƣ���ѧ����ѧ�ɼ���98
Ҫ��1������JavaBean �淶����ѧ���ࣨStudent���Ϳγ��ࣨCourse����
2��ʹ���вι�����������ѧ���γ���Ϣ������С����������������

����:
(1)����ѧ����, ����������˽�еĳ�Ա����name(����)��age(����), Course��(�γ�)
(2)�����γ���, ����������˽�г�Ա����name(�γ�����)��score(�ɼ�)
(3)����������, �����γ̶����ѧ������, ���ÿγ̵����ƺͳɼ�
(4)ͨ��ѧ�����е�print������ӡ���


�ܽ�:
(1)����������������, �ڷ����з��ص��Ƕ����ֵַ, ���޸��ֶε�����.
 */

package cn.onedull.expand2;

public class StudentDemo {

	public static void main(String[] args) {
		Course course1 = new Course();
		Student student1 = new Student("��С��", 14, course1);
		//���ÿγ����ֺͷ���
		course1.setName("����");
		course1.setScore(88);
		//��ӡ
		student1.print();
		
		//��������
		Course course2 = new Course("��ѧ", 98);
		Student student2 = new Student("����", 15, course2);
		student2.print();
		

	}

}
