/*
分别创建员工类（Employee）和部门类（Department），其中员工包含员工姓名（name），
年龄(age)。部门类中含有部门名称（deptName），每个部门中含有一个集合（emps）表
示一个部门中含有多个员工，每个员工是是唯一的，无需记录添加顺序。

给出以下部门信息表：
部门名称员工姓名员工年龄部门名称员工姓名员工年龄
部门1 小斌22 部门2 东方菇凉18
地雷23 独孤求败28
吉吉21 糖糖25
要求：1）按照JavaBean 规范定义员工类（Employee）和部门类（Department）。
2）使用有参构造器，根据员工信息表创建部门1 和部门2 两个对象。

hashset
步骤:
(1)定义员工类Employee, 成员变量姓名name(String类型),  年龄age(int类型)
(2)定义部门类Department, 成员变量部门名称deptName(String类型)
(3)定义测试类Demo, 创建部门对象,
(4)创建HashSet对象, 调用add 添加员工对象
(5)创建HashMap对象, 调用put加入部门和员工
(6)打印结果

总结:
(1)
*/
package cn.onedull.practice03;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		//部门
		Department dt1 = new Department("部门一");
		Department dt2 = new Department("部门二");
		
		//部门1员工
		HashSet<Employee> emps1 = new HashSet<Employee>();
		emps1.add(new Employee("小斌", 22));
		emps1.add(new Employee("地雷", 23));
		emps1.add(new Employee("吉吉", 21));
		
		//部门2员工
		HashSet<Employee> emps2 = new HashSet<Employee>();
		emps2.add(new Employee("东方菇凉", 18));
		emps2.add(new Employee("独孤求败", 28));
		emps2.add(new Employee("糖糖", 25));
		
		//创建HashMap对象
		HashMap<Department, HashSet<Employee>> map = new HashMap<Department, HashSet<Employee>> ();
		map.put(dt1, emps1);
		map.put(dt2, emps2);
		
		System.out.println(map);
		
		//测试
		
			
		
	}

}
