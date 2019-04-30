/*
需求：调用HashMap 的常用方法

添加操作
boolean put(Object key,Object value)：存储一个键值对到Map 中
boolean putAll(Map m)：把m 中的所有键值对添加到当前Map 中

删除操作
Object remove(Object key)：从Map 中删除指定key 的键值对，并返回被删除key 对应的value

修改操作
无专门的方法，可以调用put 方法，存储相同key，不同value 的键值对，可以覆盖原来的。

查询操作
int size()：返回当前Map 中键值对个数
boolean isEmpty()：判断当前Map 中键值对个数是否为0.
Object get(Object key)：返回Map 中指定key 对应的value 值，如果不存在该key，返回null
boolean containsKey(Object key):判断Map 中是否包含指定key
boolean containsValue(Object value):判断Map 中是否包含指定value
Set keySet()：返回Map 中所有key 所组成的Set 集合
Collection values()：返回Map 中所有value 所组成的Collection 集合
Set<Entry> entrySet()：返回Map 中所有键值对所组成的Set 集合

总结:
(1)调用entrySet方法的时候, 注意类型的写法Set<Entry<K, V>>
*/
package cn.onedull.title08;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//添加操作
		//存储一个键值对
		map.put("星期一", "小雨");
		map.put("星期二", "中雨");
		map.put("星期三", "暴雨");
		map.put("星期四", "大暴雨");
		map.put("星期五", "特大暴雨");
		//把Map m的所有键值对添加到当前Map中
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("周末", "不宜出门");
		map.putAll(m);
		System.out.println(map);
		
		System.out.println("-------------");
		
		//删除操作
		String value = map.remove("周末");
		System.out.println(value);
		System.out.println(map);
		
		//修改方法(直接覆盖)
		//替换值
		map.replace("星期一", "晴");
		
		System.out.println("---------------");
		//查询操作
		//返回当前Map中键值对个数
		int size = map.size();
		System.out.println(size);
		//判断当前Map键值对个数是否为0.
		boolean s = map.isEmpty();
		System.out.println(s);
		//返回Map中指定key对应的value值, 如果不存在返回null
		System.out.println(map.get("星期一"));
		//判断Map中是否包含指定key
		boolean k = map.containsKey("星期一");
		System.out.println(k);
		//判断Map中是否包含指定value
		boolean v = map.containsValue("晴");
//		System.out.println
		
		
		

	}

}
