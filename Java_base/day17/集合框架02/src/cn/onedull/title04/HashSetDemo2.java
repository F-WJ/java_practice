/*
���󣺴�������User ���󣬸���equals ��hashCode �������洢��HashSet �С�
��ҵĿ�ģ��˽�HashSet ���Ԫ�ع��̣��Լ�HashSet ������ж�Ԫ����ͬ��

����:
(1)����һ��User��, ��Ա��������name(String��), ����age(int��),
	����equals��hashCode����
(2)���������HashSetDemo2��, ����HashSet����
(3)����add�����ֱ����User3������
(4)�۲���

�ܽ�:
(1)HashSet�ж�Ԫ�����ȼ��hashcode, �����ͬ, �ֵ�equals�����ж�ֵ
*/
package cn.onedull.title04;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		//����HashSet����
		HashSet<User> set = new HashSet<User>();
		//���User����
		set.add(new User("С��", 20));
		set.add(new User("С��", 20));
		set.add(new User("С��", 20));
		
		//��ӡ
		//System.out.println(set);
		
		//ǳ����
		HashSet<User> clone = (HashSet) set.clone();
		clone.clear();
		System.out.println(clone);
		
		
		//���Ԫ��
		//set.clear();
		System.out.println(set);
	}

}
