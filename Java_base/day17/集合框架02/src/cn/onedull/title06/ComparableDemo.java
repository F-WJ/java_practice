/*
需求：使用Comparable 接口按照用户的年龄从小到大排序
步骤：
定义User 类，并实现Comparable 接口，覆盖compareTo 方法
创建TreeSet 对象，将User 对象添加进TreeSet 对象中

步骤:
(1)定义User类, 成员变量姓名name(String类型), 年龄age(int类型),
	实现Comparable接口,  compareTo方法
(2)创建TreeSet对象
(3)调用add方法添加User对象
(4)打印结果


总结:
(1)cannot be cast to java.lang.Comparable错误, 
	解决方案, 在类中实现Comparable接口, 覆盖compareTo方法
*/
package cn.onedull.title06;

import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		//创建TreeSet对象
		TreeSet<User> set = new TreeSet<User>();
		//调用add方法添加User对象
		set.add(new User("小月", 21));
		set.add(new User("晓月", 24));
		set.add(new User("小越", 28));
		
		//打印
		System.out.println(set);
	}

}
