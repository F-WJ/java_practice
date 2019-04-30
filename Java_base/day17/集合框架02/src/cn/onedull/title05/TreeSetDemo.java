/*
������ʾTreeSet �ӿ��еĳ��ò���

����:
(1)����TreeSet����
(2)����add����, ���Ԫ��
(3)����remove����ɾ��ĳһԪ��
(4)ͨ��iterator����Ԫ��

�ܽ�:
(1)TreeSet��HashSet��������, TreeSet�ǻ��Զ�����

*/
package cn.onedull.title05;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		//���
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println(set);
		//ɾ
		set.remove("��");
		System.out.println(set);
		
		
		//����
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String ele : set) {
			System.out.println(ele);
		}
	}

}
