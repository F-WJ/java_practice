package cn.onedell.test;

public class DogDemo {

	public static void main(String[] args) {
		//调用功能
		Skill dog = new Dog();
		dog.run();
		dog.say();
		//调用普通方法(1.8之后才能使用)
		dog.test();
		

	}

}
