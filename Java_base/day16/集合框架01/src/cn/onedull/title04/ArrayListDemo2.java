/*
���󣺴����ĸ�User ���󣬴洢��List �У������ڴ�ͼ��
��ҵĿ�ģ����ռ����д�ŵ��Ƕ�����ڴ��ַ�����Ƕ�����

����:
(1)����һ��User��, ��Ա����Ϊ����name(String), ����age(int)
(2)����ArrayList��, ����User����, ����������������ΪUser����������
	����ArrayList�����, ����add����, ���User����
	
�ܽ�:
(1)ArrayList��ŵ��Ƕ�����ڴ��ַ, ���Ƕ����ֵ
*/
package cn.onedull.title04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//����User����
		User user1 = new User("С��", 18);
		User user2 = new User("С��", 19);
		User user3 = new User("С��", 20);
		User user4 = new User("С��", 21);
		
		//����ArrayList��
		List list = new ArrayList();
		list.add(user1);
		list.add(user2);
		//��ӡ
		System.out.println(list.toString());
		//��ѯ
		User user = (User)list.get(0);
		System.out.println(user.getName());
		
	}

}
