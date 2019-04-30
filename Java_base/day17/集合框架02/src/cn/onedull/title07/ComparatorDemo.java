/*
需求：使用Comparator 接口根据用户的名字长度排序，如果名字相同按照年龄排序。
步骤：
定义一个NameComparator 类实现Comparator 接口
定义User 类，作为TreeSet 的元素类型
创建TreeSet 对象，并传入一个NameComparator 比较器对象作为TreeSet 构造器的参数

步骤:
(1)定义User类 , 成员变量姓名name(String类型), 年龄age(int类型), 覆盖toString方法
(2)定义一个NameComparator类实现Comparator接口, 并覆盖compare方法
(3)在main方法中创建TreeSet对象, 并将NameComparator对象放到TreeSet构造器参数.
(4)调用add方法添加User对象
(5)打印, 观察结果

总结:
(1)comparable和comparator的区别:
	comparable是TreeSet添加的对象里实现接口类
	comparator的实现对象是放在TreeSet对象构造器参数
	

*/
package cn.onedull.title07;

import java.util.TreeSet;


public class ComparatorDemo {

	public static void main(String[] args) {
		NameComparator name = new NameComparator();
		//创建TreeSet对象
		TreeSet<User> set = new TreeSet<User>(name);
		//调用add添加User对象
		set.add(new User("小月月", 24));
		set.add(new User("晓月", 29));
		set.add(new User("小越", 23));
		set.add(new User("小越", 24));
		
		System.out.println(set);
	}

}
