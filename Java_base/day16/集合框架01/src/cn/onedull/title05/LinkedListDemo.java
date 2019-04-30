/*
���󣺵���LinkedList ��ĳ��÷���
(1) void addFirst(Object e) ��ָ��Ԫ�ز�����б�Ŀ�ͷ��
(2) void addLast(Object e) ��ָ��Ԫ����ӵ����б�Ľ�β��
(3) Object getFirst() ���ش��б�ĵ�һ��Ԫ�ء�
(4) Object getLast() ���ش��б�����һ��Ԫ�ء�
(5) Object removeFirst() �Ƴ������ش��б�ĵ�һ��Ԫ�ء�
(6) Object removeLast() �Ƴ������ش��б�����һ��Ԫ�ء�

�ܽ�:
(1)LinkedList���������ɾ�ٶȿ�
*/
package cn.onedull.title05;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//����LinkedList����
		LinkedList list = new LinkedList();
		
		list.add("С��");
		//��ĳһԪ�ز�����б�Ŀ�ͷ
		list.addFirst("С��");
		//��ĳһԪ�ز�����б�Ľ�β
		list.addLast("����");
		//���ش��б�ĵ�һ��Ԫ��
		System.out.println(list.getFirst());
		//���ش��б� �����һ��Ԫ��
		System.out.println(list.getLast());
		//�Ƴ����б�ĵ�һ��Ԫ��
		list.removeFirst();
		//�Ƴ����б�����һ��Ԫ��
		list.removeLast();
		
		
		
		//��ӡ
		System.out.println(list.toString());
	}

}
