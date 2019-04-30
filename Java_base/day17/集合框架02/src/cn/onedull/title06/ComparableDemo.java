/*
����ʹ��Comparable �ӿڰ����û��������С��������
���裺
����User �࣬��ʵ��Comparable �ӿڣ�����compareTo ����
����TreeSet ���󣬽�User ������ӽ�TreeSet ������

����:
(1)����User��, ��Ա��������name(String����), ����age(int����),
	ʵ��Comparable�ӿ�,  compareTo����
(2)����TreeSet����
(3)����add�������User����
(4)��ӡ���


�ܽ�:
(1)cannot be cast to java.lang.Comparable����, 
	�������, ������ʵ��Comparable�ӿ�, ����compareTo����
*/
package cn.onedull.title06;

import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		//����TreeSet����
		TreeSet<User> set = new TreeSet<User>();
		//����add�������User����
		set.add(new User("С��", 21));
		set.add(new User("����", 24));
		set.add(new User("СԽ", 28));
		
		//��ӡ
		System.out.println(set);
	}

}
