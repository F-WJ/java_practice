/*
������ʾObject ���е�toString ��equals ����
����һ��Person �࣬ͨ������toString ��������ӡPerson ���������
ʹ��==��equals �Ƚ�����Person ����ͨ������õ�==��equals ������

����:
(1)����һ��Person��
(2)����һ��������(ObjectDemo), ����Person����
(3)��Person���д toString����(eclipse��ݼ�alt + shift + s + s)
(4)ͬ����Person��дequals���� (�Զ����� alt + shift + s + h)

�ܽ�:
(1)��������еĳ�Ա���������Լ���Ҫ�Ľ��,����ͨ��������������д����.
(2)==��equals���������� == �Ƚϵ��Ƕ���ĵ�ֵַ, ��equals�Ƚϵ��Ƕ��������
 */
package cn.onedull.object_demo;

public class ObjectDemo {

	public static void main(String[] args) {
		//û�и���ǰ
		Person person = new Person();
		System.out.println(person.toString());  //cn.wolfcode.object_demo.Person@659e0bfd
		//���Ǻ�
		System.out.println(person.toString()); //Person [age=0]
		
		//equals
		Person person2 = new Person();
		person.setAge(18);
		person2.setAge(18);
		System.out.println(person.equals(person2)); //true
		

	}

}
