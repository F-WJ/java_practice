/*
������ʾList �еĲ����޸��쳣

����:
(1)����ArrayList����
(2)����add�����������Ԫ��
(3)ʹ��iterator�����б�Ԫ��, ��ʹ��list��remove����ɾ��Ԫ��, �ڶ���ʹ�õ�������remove����, ע�����ַ������


�ܽ�:
(1)����ͨ��iterator����, ������ί�и�����������������, �ڵ���������֮ʱ, ͬʱ��ʹ�ü��ϵķ������޸������ݵĳ���,
	�п��ܵ������ݲ�ͬ��.
*/
package cn.onedull.title02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		//����ArrayList����
		List<String> list = new ArrayList();
		//���Ԫ��
		list.add("С��");
		list.add("С��");
		list.add("С͵");
		
		//ʹ��Iterator����
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			//it.next();
			//list.remove(0);  //ConcurrentModificationException����
			//ʹ��Iterator��remove����, ���ᱨ��
			if("С��".equals(it.next())) {
				it.remove();
			}
		
		}
		System.out.println(list);
		
	}

}
