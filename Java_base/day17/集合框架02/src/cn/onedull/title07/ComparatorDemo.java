/*
����ʹ��Comparator �ӿڸ����û������ֳ����������������ͬ������������
���裺
����һ��NameComparator ��ʵ��Comparator �ӿ�
����User �࣬��ΪTreeSet ��Ԫ������
����TreeSet ���󣬲�����һ��NameComparator �Ƚ���������ΪTreeSet �������Ĳ���

����:
(1)����User�� , ��Ա��������name(String����), ����age(int����), ����toString����
(2)����һ��NameComparator��ʵ��Comparator�ӿ�, ������compare����
(3)��main�����д���TreeSet����, ����NameComparator����ŵ�TreeSet����������.
(4)����add�������User����
(5)��ӡ, �۲���

�ܽ�:
(1)comparable��comparator������:
	comparable��TreeSet��ӵĶ�����ʵ�ֽӿ���
	comparator��ʵ�ֶ����Ƿ���TreeSet������������
	

*/
package cn.onedull.title07;

import java.util.TreeSet;


public class ComparatorDemo {

	public static void main(String[] args) {
		NameComparator name = new NameComparator();
		//����TreeSet����
		TreeSet<User> set = new TreeSet<User>(name);
		//����add���User����
		set.add(new User("С����", 24));
		set.add(new User("����", 29));
		set.add(new User("СԽ", 23));
		set.add(new User("СԽ", 24));
		
		System.out.println(set);
	}

}
