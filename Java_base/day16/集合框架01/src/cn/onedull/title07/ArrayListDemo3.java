/*
需求：使用泛型创建ArrayList 类对象，并调用ArrayList 中的增删改查方法

步骤:
(1)创建ArrayList类对象
(2)调用add(增), set(改), remove(删), get(查)

总结:
(1)一旦泛型类定了之后, 插入数据的时候只能泛型类的类型
*/
package cn.onedull.title07;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<String> list = new ArrayList<String>();
		//增
		list.add("小月");
		list.add("小风");
		System.out.println(list);
		//删
		list.remove("小月");
		System.out.println(list);
		//改
		list.set(0, "小光");
		System.out.println(list);
		//查
		list.get(0);
		
		
		
		

	}

}
