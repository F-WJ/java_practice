/*
需求：调用ArrayList 类的常用方法

添加操作
boolean add(Object e)：将元素添加到列表的末尾
void add(int index, Object element)：在列表的指定位置插入指定的元素
boolean addAll(Collection c)：把c 列表中的所有元素添加到当前列表中

删除操作
Object remove(int index)：从列表中删除指定索引位置的元素,并返回被删除的元素
boolean removeAll(Collection c)：从此列表中移除c 列表中的所有元素

修改操作
Object set(int index, Object ele)：修改列表中指定索引位置的元素，返回被替换的旧元素

查询操作
int size()：返回当前列表中元素个数
boolean isEmpty()：判断当前列表中元素个数是否为0
Object get(int index)：查询列表中指定索引位置对应的元素
Object[] toArray()：把列表对象转换为Object 数组
boolean contains(Object o):判断列表是否存在指定对象

注意，标红的是重度使用的方法。
作业目的：掌握ArrayList 中的常用方法的使用，记住标红的五个单词。


总结:
(1)使用add(int index E element)方法的时候, 注意索引值不能超过列表的索引最大值
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
		//添加数据
		list2.add("list2");
		list2.add(19);
		//添加数据
		list.add("小越");
		list.add(9);
		//注意范围, 不能超过list索引范围
		list.add(0, "小风");
		//插入list2列表到list1
		list.addAll(list2);
		list.addAll(set);
		
		//删除
		list.remove(0);
		System.out.println("list前: " + list.toString());
		//
		//list2.removeAll(list2);
		list2.remove(0);
		//删除list2的时候, 是通过对比list2的元素来判断
		boolean test = list.removeAll(list2);
		
		//修改操作
		list.set(0, "小天");
		
		//查询操作
		System.out.println(list.size());
		System.out.println(list.get(0));
		//把列表对象转换为object数组
		System.out.println(list.toArray());
		//判断列表是否存在指定对象
		System.out.println(list.contains("小天"));
		
		System.out.println("---------------");
		//打印
		System.out.println(test);
		System.out.println("list2后: " + list2.toString());
		System.out.println("list后: " + list.toString());
	}

}
