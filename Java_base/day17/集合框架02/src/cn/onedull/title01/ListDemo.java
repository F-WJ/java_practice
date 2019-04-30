/*
需求：演示List 迭代的三种方式
步骤:
(1)使用for循环遍历列表元素
(2)使用foreach循环遍历列表元素
(3)使用Iterator迭代器来遍历列表元素


总结:
(1)for循环只能遍历List集合, 因为有索引
*/
package cn.onedull.title01;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<String> list = new ArrayList<String>();
		//添加元素
		list.add("小月");
		list.add("小越");
		list.add("小悦");
		
		//for循环
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
