/*
需求：演示HashMap 的迭代操作（三个）

步骤:
(1)创建HashMap对象
(2)调用put方法添加键值对
(3)调用keySet方法, 获取所有键值
(4)调用values方法, 获取所有value值
(5)调用entrySet方法,获取所有键值对

总结:
(1)HashMap因为没有继承于Collection接口, 所以没有iterator方法, 不能直接使用for-each操作, 只能先通过调用entrySet方法, 再调用iterator方法来迭代
*/
package cn.onedull.title09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//创建对象
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("小于", 85.0);
		map.put("小天", 98.0);
		map.put("小葱", 88.0);
		
		//keySet方法
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
