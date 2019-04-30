/*
������ʾHashMap �ĵ���������������

����:
(1)����HashMap����
(2)����put������Ӽ�ֵ��
(3)����keySet����, ��ȡ���м�ֵ
(4)����values����, ��ȡ����valueֵ
(5)����entrySet����,��ȡ���м�ֵ��

�ܽ�:
(1)HashMap��Ϊû�м̳���Collection�ӿ�, ����û��iterator����, ����ֱ��ʹ��for-each����, ֻ����ͨ������entrySet����, �ٵ���iterator����������
*/
package cn.onedull.title09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//��������
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("С��", 85.0);
		map.put("С��", 98.0);
		map.put("С��", 88.0);
		
		//keySet����
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}

		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
			
		}
		
		System.out.println("---------------------");
		//
		Collection<Double> values = map.values();
		for(Double value : values) {
			System.out.println(value);
		}
		
		System.out.println("----------------------");
		Set<Entry<String, Double>> entry = map.entrySet();
		for(Entry<String, Double> ele : entry) {
			System.out.println(ele.getKey());
		}
	}

}
