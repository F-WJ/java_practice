/*
需求：创建三个User 对象，覆盖equals 和hashCode 方法，存储在HashSet 中。
作业目的：了解HashSet 添加元素过程，以及HashSet 是如何判断元素相同的

步骤:
(1)定义一个User类, 成员变量姓名name(String类), 年龄age(int类),
	覆盖equals和hashCode方法
(2)定义测试类HashSetDemo2类, 创建HashSet对象
(3)调用add方法分别添加User3个对象
(4)观察结果

总结:
(1)HashSet判断元素首先检测hashcode, 如果相同, 又到equals方法判断值
*/
package cn.onedull.title04;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		//创建HashSet对象
		HashSet<User> set = new HashSet<User>();
		//添加User对象
		set.add(new User("小月", 20));
		set.add(new User("小月", 20));
		set.add(new User("小月", 20));
		
		//打印
		//System.out.println(set);
		
		//浅复制
		HashSet<User> clone = (HashSet) set.clone();
		clone.clear();
		System.out.println(clone);
		
		
		//清空元素
		//set.clear();
		System.out.println(set);
	}

}
