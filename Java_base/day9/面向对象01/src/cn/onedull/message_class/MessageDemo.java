/*
 题目:
1、阅读信息卡，完成要求：
姓名(name)：张三
年龄(age) ：18
性别(gender)：男
英语(enScore)：90
数学(mathScore)：135
语文(cnScore)：105
姓名(name)：李四
年龄(age) ：20
性别(gender)：女
英语(enScore)：130
数学(mathScore)：100
语文(cnScore)：125

1>根据信息卡信息，抽象成一个学生类(Student)，然后实例化张三，李四2 个对象。

步骤:
(1)创建一个Message类, 成员使用private修饰符
(2)先创建一个message1对象, 然后设置值
(3)message2同理

总结:
(1)封装: 就是隐藏了实现细节, 但对外提供了访问(使用)
(2)getter方法: 返回一个字段的值
(3)setter方法: 给某一个字段设置值
 */
package cn.onedull.message_class;

public class MessageDemo {

	public static void main(String[] args) {
		//创建对象
		Message message1 = new Message();
		//设置值
		message1.setName("张三");
		message1.setAge(18);
		message1.setGender("男");
		message1.setEnScore(90);
		message1.setMathScore(135);
		message1.setCnScore(105);
		System.out.println(message1.getName());
		
		//创建对象
		Message message2 = new Message();
		
		//设置值
		message2.setName("李四");
		message2.setAge(20);
		message2.setGender("女");
		message2.setEnScore(130);
		message2.setMathScore(100);
		message2.setCnScore(125);
		

	}

}
