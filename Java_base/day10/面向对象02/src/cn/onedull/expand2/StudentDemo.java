/*
分别创建学生类（Student）和课程类（Course），其中学生类中含有一门课程，还有学生姓
名、年龄这两个成员变量。课程类中含有课程名称、成绩。
给出以下学生课程信息表：
·学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
·学生姓名：王飞，年龄:15,课程名称：数学，数学成绩：98
要求：1）按照JavaBean 规范定义学生类（Student）和课程类（Course）。
2）使用有参构造器，根据学生课程信息表创建黄小铭和王飞两个对象。

步骤:
(1)创建学生类, 里面有三个私有的成员变量name(名字)和age(年龄), Course类(课程)
(2)创建课程类, 里面有两个私有成员变量name(课程名称)和score(成绩)
(3)创建测试类, 创建课程对象和学生对象, 设置课程的名称和成绩
(4)通过学生类中的print方法打印结果


总结:
(1)利用类是引用类型, 在方法中返回的是对象地址值, 来修改字段的内容.
 */

package cn.onedull.expand2;

public class StudentDemo {

	public static void main(String[] args) {
		Course course1 = new Course();
		Student student1 = new Student("黄小铭", 14, course1);
		//设置课程名字和分数
		course1.setName("语文");
		course1.setScore(88);
		//打印
		student1.print();
		
		//创建对象
		Course course2 = new Course("数学", 98);
		Student student2 = new Student("王飞", 15, course2);
		student2.print();
		

	}

}
