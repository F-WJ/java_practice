/*
���󣺵���ArrayList ��ĳ��÷���

��Ӳ���
boolean add(Object e)����Ԫ����ӵ��б��ĩβ
void add(int index, Object element)�����б��ָ��λ�ò���ָ����Ԫ��
boolean addAll(Collection c)����c �б��е�����Ԫ����ӵ���ǰ�б���

ɾ������
Object remove(int index)�����б���ɾ��ָ������λ�õ�Ԫ��,�����ر�ɾ����Ԫ��
boolean removeAll(Collection c)���Ӵ��б����Ƴ�c �б��е�����Ԫ��

�޸Ĳ���
Object set(int index, Object ele)���޸��б���ָ������λ�õ�Ԫ�أ����ر��滻�ľ�Ԫ��

��ѯ����
int size()�����ص�ǰ�б���Ԫ�ظ���
boolean isEmpty()���жϵ�ǰ�б���Ԫ�ظ����Ƿ�Ϊ0
Object get(int index)����ѯ�б���ָ������λ�ö�Ӧ��Ԫ��
Object[] toArray()�����б����ת��ΪObject ����
boolean contains(Object o):�ж��б��Ƿ����ָ������

ע�⣬�������ض�ʹ�õķ�����
��ҵĿ�ģ�����ArrayList �еĳ��÷�����ʹ�ã���ס����������ʡ�


�ܽ�:
(1)ʹ��add(int index E element)������ʱ��, ע������ֵ���ܳ����б���������ֵ
*/
package cn.onedull.title03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//list2
		ArrayList list2 = new ArrayList();
		Set set = new HashSet();
		set.add("222");
		//�������
		list2.add("list2");
		list2.add(19);
		//�������
		list.add("СԽ");
		list.add(9);
		//ע�ⷶΧ, ���ܳ���list������Χ
		list.add(0, "С��");
		//����list2�б�list1
		list.addAll(list2);
		list.addAll(set);
		
		//ɾ��
		list.remove(0);
		System.out.println("listǰ: " + list.toString());
		//
		//list2.removeAll(list2);
		list2.remove(0);
		//ɾ��list2��ʱ��, ��ͨ���Ա�list2��Ԫ�����ж�
		boolean test = list.removeAll(list2);
		
		//�޸Ĳ���
		list.set(0, "С��");
		
		//��ѯ����
		System.out.println(list.size());
		System.out.println(list.get(0));
		//���б����ת��Ϊobject����
		System.out.println(list.toArray());
		//�ж��б��Ƿ����ָ������
		System.out.println(list.contains("С��"));
		
		System.out.println("---------------");
		//��ӡ
		System.out.println(test);
		System.out.println("list2��: " + list2.toString());
		System.out.println("list��: " + list.toString());
	}

}
