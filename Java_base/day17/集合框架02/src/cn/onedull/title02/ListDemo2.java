/*
需求：演示List 中的并发修改异常

步骤:
(1)创建ArrayList对象
(2)调用add方法添加三个元素
(3)使用iterator迭代列表元素, 并使用list的remove方法删除元素, 第二次使用迭代器的remove方法, 注意两种方法结果


总结:
(1)集合通过iterator方法, 将数据委托给迭代器对象来操作, 在迭代器遍历之时, 同时又使用集合的方法来修改了数据的长度,
	有可能导致数据不同步.
*/
package cn.onedull.title02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		//创建ArrayList对象
		List<String> list = new ArrayList();
		//添加元素
		list.add("小天");
		list.add("小田");
		list.add("小偷");
		
		//使用Iterator迭代
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			//it.next();
			//list.remove(0);  //ConcurrentModificationException错误
			//使用Iterator的remove方法, 不会报错
			if("小天".equals(it.next())) {
				it.remove();
			}
		
		}
		System.out.println(list);
		
	}

}
