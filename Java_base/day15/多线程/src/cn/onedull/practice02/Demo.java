/*
实现一个名为Person的类和它的子类Employee（普通员工），Manager（经理）是Employee的子类，
设计一个方法addSalary作为涨工资，普通员工一次能涨10％，经理能涨20％。 

步骤:
(1)创建Person类, 成员变量有姓名name(String类型)，地址address(String类型)，定义该类的有参构造方法； 
(2)创建Employee类, 成员变量工号id(String型)，工资salary(double类型)，工龄(int型)，
	定义该类的有参构造方法,成员方法addSalary()
(3)创建Manager类, 成员变量有级别level(String类型)定义该类的构造方法, 成员方法addSalary()
(4)编写一个测试类Demo，创建Emloyee, 调用addSalary方法
(5)通过多态创建Manager对象, 调用addSalary方法

总结:
(1)利用多态思想, 父类变量指向子类对象的时候, 调用的方法实际调用是子类方法
*/
package cn.onedull.practice02;

public class Demo {

	public static void main(String[] args) {
		//创建员工类对象
		Employee em = new Employee("1", 7000, 8);
		em.setName("小王");
		//创建经理类对象
		Employee em2 = new Manager();
		em2.setSalary(10000);
		em2.setName("王经理");
		//
		em.addSalary(em.getSalary());
		em2.addSalary(em2.getSalary());
		
		
	}

}
