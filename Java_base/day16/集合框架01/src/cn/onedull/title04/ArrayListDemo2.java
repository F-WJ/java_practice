/*
需求：创建四个User 对象，存储在List 中，分析内存图。
作业目的：掌握集合中存放的是对象的内存地址，不是对象本身

步骤:
(1)定义一个User类, 成员变量为姓名name(String), 年龄age(int)
(2)定义ArrayList类, 创建User对象, 并把姓名和年龄作为User构造器参数
	创建ArrayList类对象, 调用add方法, 添加User对象
	
总结:
(1)ArrayList存放的是对象的内存地址, 不是对象的值
*/
package cn.onedull.title04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//创建User对象
		User user1 = new User("小月", 18);
		User user2 = new User("小章", 19);
		User user3 = new User("小康", 20);
		User user4 = new User("小凤", 21);
		
		//创建ArrayList类
		List list = new ArrayList();
		list.add(user1);
		list.add(user2);
		//打印
		System.out.println(list.toString());
		//查询
		User user = (User)list.get(0);
		System.out.println(user.getName());
		
	}

}
