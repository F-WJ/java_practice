/*
已知生物(Biology)、动物(Animal)、人(Person)三个接口。其中生物接口定义呼吸方法(breathe)；
动物接口除具备生物接口特征之外，还定义了吃饭(eat)和睡觉(sleep)两个方法；
人接口除具备动物接口特征外，还定义了思维(think)和学习(study)两个抽象方法。
1)请使用继承的思想定义上述三个接口,
2)定义一个学生类(Student)实现上述人接口。
3)定义测试类TestDemo ,使用多态的思想在main 方法中创建Student 的对象, 调用相应的
功能分别实现打印
“我能思考” ; “我能学习” ; “我能睡觉” ; “我能吃饭” ;”我能呼吸”

步骤:
(1)定义接口动物(IAnimal), 方法为呼吸
(2)定义接口生物(IBiology), 并继承动物接口,  方法为吃饭和睡觉 
(3)定义接口人(IPerson), 并继承生物接口, 方法为思维和学习
(4)创建一个学生类, 通过implements实现上述人接口, 覆盖接口方法
(5)创建测试类testDemo, 创建Student对象, 调用方法.

总结:
(1)接口可以继承接口, 多个也可以
 */
package cn.onedell.practice1;

public class TestDemo {

	public static void main(String[] args) {
		//
		IPerson student = new Student();
		student.think();
		student.study();
		student.sleep();
		student.eat();
		student.breathe();
	}

}
