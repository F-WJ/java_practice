/*
需求：作为StudentDemo 类和对象的测试类
步骤：
Student类
(1)学生有姓名、年龄两个字段
(2)符合JavaBean 规范

StudentDemo类
(1)创建学生对象
(2)使用setter 方法设置值
(3)获取对象成员变量的值
(4)通过有参数构造器创建对象并使用setter 方法修改值

总结:
(1)JavaBean规范: 类必须使用public修饰, 必须保证有无参数构造器, 
     字段(成员变量)使用private, 每一个字段提供getter和setter方法.

 */
package cn.onedull.student_class;

public class StudentDemo {

	public static void main(String[] args) {
		//创建student对象
		Student student = new Student();
		
		//通过getter方法获取成员变量的值
		//student.setName("小柯");
		String name = student.getName();
		System.out.println(name);
		
		//使用带参数构造器创建student2对象
		Student student2 = new Student("小安", 2);
		System.out.println(student2.getName() + " , " + student2.getAge());
		
		//通过setter方法修改
		student2.setName("小柯");
		student2.setAge(4);
		System.out.println(student2.getName() + " , " + student2.getAge());
			

	}

}
