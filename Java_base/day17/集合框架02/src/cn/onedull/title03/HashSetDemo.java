/*
������ʾHashSet �ӿ��еĳ��ò���
����
ɾ��
����

����:
(1)����HashSet����
(2)����add���������Ԫ��
(3)


�ܽ�:
(1)Hashset��û���޸ĺͲ鿴�ķ���, ֻ��ͨ���������鿴Ԫ��.
*/
package cn.onedull.title03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		//��������
		HashSet<String> list = new HashSet<String>();
		//���Ԫ��
		list.add("СԽ");
		list.add("С��");
		list.add("����");
		System.out.println(list);
		//ɾ��Ԫ��
		list.remove("С��");
		System.out.println(list);
		
		System.out.println("------------");
		
		//�Ƿ����ĳһԪ��
		boolean result = list.contains("СԽ");
		System.out.println(result);
		System.out.println("--------------");
		//iterator����������Ԫ��
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("-------------");
		//foreach
		for(String ele : list) {
			System.out.println(ele);
		}
	
	}

	
}
