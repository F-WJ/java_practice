/*
���󣺶���һ������JavaBean �淶��ѧ���ಢʹ��this �ؼ���

����:
(1)����һ��Student��
(2)��������private���η���name��age����
(3)�Զ���һ���޲ι�����

�ܽ�:
(1)����ֲ������ͳ�Ա��������������, thisָ��ǰ����
 */
package cn.onedull.student_demo;

public class StudentDemo {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("С��");
		student.setAge(3);
		
		String name = student.getName();
		int age = student.getAge();
		System.out.println(name + ", " + age);

	}

}
