/*
需求：演示Object 类中的toString 和equals 方法
创建一个Person 类，通过覆盖toString 方法，打印Person 对象的内容
使用==和equals 比较两个Person 对象，通过结果得到==和equals 的区别

步骤:
(1)创建一个Person类
(2)创建一个测试类(ObjectDemo), 创建Person对象
(3)在Person类编写 toString方法(eclipse快捷键alt + shift + s + s)
(4)同样在Person编写equals方法 (自动生成 alt + shift + s + h)

总结:
(1)如果父类中的成员方法不是自己想要的结果,可以通过方法覆盖来改写功能.
(2)==和equals的区别在于 == 比较的是对象的地址值, 而equals比较的是对象的内容
 */
package cn.onedull.object_demo;

public class ObjectDemo {

	public static void main(String[] args) {
		//没有覆盖前
		Person person = new Person();
		System.out.println(person.toString());  //cn.wolfcode.object_demo.Person@659e0bfd
		//覆盖后
		System.out.println(person.toString()); //Person [age=0]
		
		//equals
		Person person2 = new Person();
		person.setAge(18);
		person2.setAge(18);
		System.out.println(person.equals(person2)); //true
		

	}

}
