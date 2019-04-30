/*
分别创建学生类（Student）和课程类（Course），其中学生类中含有一门课程，还有学生姓名、年龄这两个成员变量。课程类中含有课程名称、成绩。
给出以下学生课程信息表：
·学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
·学生姓名：王飞，年龄:15,课程名称：数学，数学成绩：98
要求：
1）按照JavaBean规范定义学生类（Student）和课程类（Course）。
2）使用有参构造器，根据学生课程信息表创建黄小铭和王飞两个对象。


步骤:
(1)创建一个学生类, 成员变量有姓名(name), 年龄(age), 课程(course)
(2)创建一个课程类, 成员变量有课程(course), 成绩(score)
(3)创建测试类Demo, 创建学生和课程对象, 调用print方法, 打印学生信息


总结:
(1)类也可以作为成员变量
(2)当类作为方法的参数时, 传递的是对象地址

*/
package cn.onedull.practice01;

public class Demo {

	public static void main(String[] args) {
		//创建对象
		Course cs1 = new Course("语文", 88);
		Course cs2 = new Course("数学", 98);
		Student st1 = new Student("黄小铭", 14, cs1);
		Student st2 = new Student("王飞", 15, cs2);

		//打印
		st1.print();
		st2.print();
		
	}

}
