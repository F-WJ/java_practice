/*
����ʹ�÷��ʹ���ArrayList ����󣬲�����ArrayList �е���ɾ�Ĳ鷽��

����:
(1)����ArrayList�����
(2)����add(��), set(��), remove(ɾ), get(��)

�ܽ�:
(1)һ�������ඨ��֮��, �������ݵ�ʱ��ֻ�ܷ����������
*/
package cn.onedull.title07;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<String> list = new ArrayList<String>();
		//��
		list.add("С��");
		list.add("С��");
		System.out.println(list);
		//ɾ
		list.remove("С��");
		System.out.println(list);
		//��
		list.set(0, "С��");
		System.out.println(list);
		//��
		list.get(0);
		
		
		
		

	}

}
