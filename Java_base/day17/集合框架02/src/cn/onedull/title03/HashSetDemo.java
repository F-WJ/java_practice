/*
需求：演示HashSet 接口中的常用操作
增：
删：
遍历

步骤:
(1)创建HashSet对象
(2)调用add方法来添加元素
(3)


总结:
(1)Hashset类没有修改和查看的方法, 只能通过遍历来查看元素.
*/
package cn.onedull.title03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		//创建对象
		HashSet<String> list = new HashSet<String>();
		//添加元素
		list.add("小越");
		list.add("小月");
		list.add("晓月");
		System.out.println(list);
		//删除元素
		list.remove("小月");
		System.out.println(list);
		
		System.out.println("------------");
		
		//是否存在某一元素
		boolean result = list.contains("小越");
		System.out.println(result);
		System.out.println("--------------");
		//iterator来遍历所有元素
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("-------------");
		//foreach
		for(String ele : list) {
			System.out.println(ele);
		}
	
	}

	
}
