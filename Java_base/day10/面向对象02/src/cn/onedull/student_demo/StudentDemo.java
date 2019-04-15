/*
需求：定义一个符合JavaBean 规范的学生类并使用this 关键字

步骤:
(1)创建一个Student类
(2)创建两个private修饰符的name和age变量
(3)自定义一个无参构造器

总结:
(1)解决局部变量和成员变量重命名问题, this指当前对象
 */
package cn.onedull.student_demo;

public class StudentDemo {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("小肥");
		student.setAge(3);
		
		String name = student.getName();
		int age = student.getAge();
		System.out.println(name + ", " + age);

	}

}
