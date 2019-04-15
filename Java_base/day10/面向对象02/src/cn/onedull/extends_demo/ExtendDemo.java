/*
�?求：使用面向对象的知识定义出老师（Teacher）�?�学生（Student）�?�员工（Employee）三
个类�?
�? 老师：拥有名字�?�年龄�?�级别三个状态，有授课和休息两个功能
�? 学生：拥有名字�?�年龄�?�学好三个状态，有学习和休息两个功能
�? 员工：拥有名字�?�年龄�?�入职时间三个状态，有工作和休息两个功能

步骤:
(1)创建�?个父�?(Person), 成员变量为名�?, 年龄; 成员方法为rest(休息)
(2)创建子类老师�?(Teacher), 成员变量为级�?, 成员方法为schoolTeach(授课)
(3)创建子类学生�?(Student), 成员变量为学�?, 成员方法为study(学习)
(4)创建子类员工�?(Employee),称为变量为入职时�?, 成员方法为work(有工�?)
(5)三个子类都继�?(extends)父类(Person)
(5)创建�?个测试类(ExtendDemo), 创建三个对象, 设置�?, 并打印结�?

总结:
(1)继承使用extends关键�?
(2)注意java只支持单继承
(3)�?个父类可以有多个子类

 */

package cn.onedull.extends_demo;

public class ExtendDemo {

	public static void main(String[] args) {
		//老师
		Teacher teacher = new Teacher(); 
		teacher.setName("小胖");
		teacher.setAge(30);
		teacher.setLevel("�?�?");
		String name = teacher.getName();
		int age = teacher.getAge();
		String level = teacher.getLevel();
		System.out.println(name + ", " + age + ", " + level);
		teacher.rest();
		teacher.schoolTeach();
		
		System.out.println("---------------------");
		
		//学生
		Student student = new Student();
		student.setName("小白");
		student.setAge(15);
		student.setSn(123456);
		name = student.getName();
		age = student.getAge();
		int sn = student.getSn();
		System.out.println(name + ", " + age + ", " + sn);
		student.study();
		student.rest();
		
		System.out.println("---------------------");
		
		//员工
		Employee employee = new Employee();
		employee.setName("阿勒");
		employee.setAge(40);
		employee.setCometime("2019-04-11");
		name = employee.getName();
		age = employee.getAge();
		String cometime = employee.getCometime();
		System.out.println(name + ", " + age + ", " + cometime);
		employee.work();
		employee.rest();
		
		

	}

}
