package cn.onedull.extends_demo;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		
	}

	void rest(){
		System.out.println("休息");
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
