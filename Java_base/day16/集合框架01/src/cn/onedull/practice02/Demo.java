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
4）计算class05 班级的平均分。（明天做）

步骤:
(1)创建学生类Student, 成员变量姓名name(String), 年龄age(int), 成绩score(int), 班级号classNum(Stirng)
(2)在main方法创建ArrayList对象, 调用add方法添加Student对象


总结:
(1)通过ArrayList类的size方法能知道列表的元素数
*/
package cn.onedull.practice02;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30, 80, "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		
		//修改Jerry的成绩为90
		for(int i = 0; i < list.size(); i++) {
			if("Jerry".equals(list.get(i).getName())) {
				list.get(i).setScore(90);
			}
		}
		System.out.println(list);
		
		//删除Kevin数据
		for(int i = 0; i < list.size(); i++) {
			if("Jerry".equals(list.get(i).getName())) {
				list.remove(i);
			}
		}
		//System.out.println(list);
		
		
		//计算class05班级的平均分
		double sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i).getScore();
		}
		double average = sum / list.size();
		System.out.println("平均分: " + average);
	}

}
