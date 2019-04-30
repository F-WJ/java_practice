/*
需求：演示TreeSet 接口中的常用操作

步骤:
(1)创建TreeSet对象
(2)调用add方法, 添加元素
(3)调用remove方法删除某一元素
(4)通过iterator迭代元素

总结:
(1)TreeSet和HashSet区别在于, TreeSet是会自动排序

*/
package cn.onedull.title05;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		//添加
		set.add("你");
		set.add("冇");
		set.add("树");
		set.add("了");
		set.add("吧");
		System.out.println(set);
		//删
		set.remove("了");
		System.out.println(set);
		
		
		//遍历
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String ele : set) {
			System.out.println(ele);
		}
	}

}
