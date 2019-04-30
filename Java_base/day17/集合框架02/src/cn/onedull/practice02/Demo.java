/*
有如下Student 对象，对象中包含姓名（name）、年龄（age）、成绩（score）、班级号
（classNum）等成员变量，其中，classNum 表示学生的班号，例如“class05”。
学生信息表数据如下：
序号姓名年龄成绩班级号序号姓名年龄成绩班级号
1 Tom 18 100 class05 4 Jim 30 80 class05
2 Jerry 22 70 class04 5 Steve 28 66 class06
3 Owen 25 90 class05 6 Kevin 24 100 class04
请根据学生信息表，完成下列要求：
1）创建ArrayList 对象studList，并根据学生信息表添加学生数据。
2）修改Jerry 的成绩将70 修改为90。
3）删除Kevin 这一条学生数据。
4）计算class05 班级的平均分。

步骤:
(1)定义Student类, 成员变量姓名name(String), 年龄age(int类型),  成绩score(double类型), 班级号classNum(String)
(2)定义测试类Demo, 创建ArrayList, 调用add方法添加student对象
(3)调用remove方法删除某一学生数据
(4)通过for循环遍历列表元素, 并计算class05平均分

总结:
(1)ArrayList添加对象的时候, 只是添加对象的内存地址
*/
package cn.onedull.practice02;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<Student> list = new ArrayList<Student>();
		
		//添加数据
		 list.add(new Student("Tom", 18, 100, "class05"));
		 list.add(new Student("Jerry", 22, 70, "class04"));
		 list.add(new Student("Owen", 25, 90, "class05"));
		 list.add(new Student("Jim", 30, 80, "class05"));
		 list.add(new Student("Steve", 28, 66, "class06"));
		 list.add(new Student("Kevin", 24, 100, "class04"));
		 
		 //修改Jerry 的成绩将70 修改为90
		 for(int i = 0; i < list.size(); i++) {
			 if("Jerry".equals(list.get(i).getName())){
				 list.get(i).setScore(90);
			 }
		 }
		 
		 //删除Kevin 这一条学生数据
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			//Student st = it.next();
			if("Kevin".equals(it.next().getName())) {
				it.remove();
			}
		}
		
		System.out.println(list);
		
		//计算class05 班级的平均分
		double average = 0;
		int time = 0;
		for(Student st : list) {
			if("class05".equals(st.getClassNum())){
				average = average + st.getScore();
				time++;
			}
		}
		System.out.println("class05班级平均分" + (average / time));
	}

}
