package cn.onedull.static_demo;

public class Dog {
	private String name;
	static int age;
	
	public Dog() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println("����");
	}
	
	static void say() {
		System.out.println("������");
	}

//	public static int getAge() {
//		return age;
//	}
//
//	public static void setAge(int age) {
//		Dog.age = age;
//	}
//	
}
