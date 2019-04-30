/*
������ʾList ���������ַ�ʽ
����:
(1)ʹ��forѭ�������б�Ԫ��
(2)ʹ��foreachѭ�������б�Ԫ��
(3)ʹ��Iterator�������������б�Ԫ��


�ܽ�:
(1)forѭ��ֻ�ܱ���List����, ��Ϊ������
*/
package cn.onedull.title01;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<String> list = new ArrayList<String>();
		//���Ԫ��
		list.add("С��");
		list.add("СԽ");
		list.add("С��");
		
		//forѭ��
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------");
		
		//foreach
		for(String ele : list) {
			System.out.println(ele);
		}
		
		System.out.println("--------------");
		
		//iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
