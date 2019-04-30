/*
需求：调用LinkedList 类的常用方法
(1) void addFirst(Object e) 将指定元素插入此列表的开头。
(2) void addLast(Object e) 将指定元素添加到此列表的结尾。
(3) Object getFirst() 返回此列表的第一个元素。
(4) Object getLast() 返回此列表的最后一个元素。
(5) Object removeFirst() 移除并返回此列表的第一个元素。
(6) Object removeLast() 移除并返回此列表的最后一个元素。

总结:
(1)LinkedList类对数据增删速度快
*/
package cn.onedull.title05;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//创建LinkedList对象
		LinkedList list = new LinkedList();
		
		list.add("小天");
		//将某一元素插入此列表的开头
		list.addFirst("小月");
		//将某一元素插入此列表的结尾
		list.addLast("大田");
		//返回此列表的第一个元素
		System.out.println(list.getFirst());
		//返回此列表 的最后一个元素
		System.out.println(list.getLast());
		//移除此列表的第一个元素
		list.removeFirst();
		//移除此列表的最后一个元素
		list.removeLast();
		
		
		
		//打印
		System.out.println(list.toString());
	}

}
