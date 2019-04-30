/*
现有三个自定义异常年龄低异常（LowAgeException）、年龄高异常(HighAgeException)、
工资高异常（HighSalaryException），他们分别为运行时异常，并且调用了父类构造器public
RuntimeException(String message); public RuntimeException(String message, Throwable cause)
编写一个员工类：
(1) 有属性：
编号，姓名，年龄，工资，身份证号码，员工人数，员工工资总额
(2) 有构造器：
构造器：设置编号，年龄，姓名；如果年龄小于18，抛出年龄低异常，如果年龄大于60 抛
出年龄高异常，如果姓名为null 或为空字符串，抛出空异常。
(3) 有方法
增加工资addSalary(double addSalary)，声明抛出工资高异常，当增加后的工资大于员工工
资总额时，抛出此异常。

步骤:
(1)创建三个自定义异常类, 年龄低异常（LowAgeException）、年龄高异常(HighAgeException)、
工资高异常（HighSalaryException）, 都继承RuntimeException, 定义有参构造器, 用来传递错误信息
(2)定义一个员工类, 6个private类型成员变量(编号，姓名，年龄，工资，身份证号码，员工人数), 
一个static类型成员变量(员工工资总额), 一个addSalary方法
(3)在有参构造器里面添加使用throw异常处理
(4)创建测试类Demo, 创建员工对象, 调用相应方法, 测试

总结:
(1)计算某一总数时, 可以使用static修饰, 将字段共享
*/
package cn.odedull.practice1;

public class Demo {

	public static void main(String[] args) {
		Staff st1 = new Staff(1, "小化", 19);
		//工资
		st1.setSalary(8000);
		Staff.staffSalarySum = st1.getSalary();
		Staff st2 = new Staff(2, "小天", 20);
		st2.setSalary(18000);
		Staff.staffSalarySum = st2.getSalary();
		st1.addSalary(10000);
	}

}
