/*
��֪����(Biology)������(Animal)����(Person)�����ӿڡ���������ӿڶ����������(breathe)��
����ӿڳ��߱�����ӿ�����֮�⣬�������˳Է�(eat)��˯��(sleep)����������
�˽ӿڳ��߱�����ӿ������⣬��������˼ά(think)��ѧϰ(study)�������󷽷���
1)��ʹ�ü̳е�˼�붨�����������ӿ�,
2)����һ��ѧ����(Student)ʵ�������˽ӿڡ�
3)���������TestDemo ,ʹ�ö�̬��˼����main �����д���Student �Ķ���, ������Ӧ��
���ֱܷ�ʵ�ִ�ӡ
������˼���� ; ������ѧϰ�� ; ������˯���� ; �����ܳԷ��� ;�����ܺ�����

����:
(1)����ӿڶ���(IAnimal), ����Ϊ����
(2)����ӿ�����(IBiology), ���̳ж���ӿ�,  ����Ϊ�Է���˯�� 
(3)����ӿ���(IPerson), ���̳�����ӿ�, ����Ϊ˼ά��ѧϰ
(4)����һ��ѧ����, ͨ��implementsʵ�������˽ӿ�, ���ǽӿڷ���
(5)����������testDemo, ����Student����, ���÷���.

�ܽ�:
(1)�ӿڿ��Լ̳нӿ�, ���Ҳ����
 */
package cn.onedell.practice1;

public class TestDemo {

	public static void main(String[] args) {
		//
		IPerson student = new Student();
		student.think();
		student.study();
		student.sleep();
		student.eat();
		student.breathe();
	}

}
