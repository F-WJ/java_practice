package cn.onedull.spring._02_ioc;

public class Person {
	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void doWork(){
		System.out.println("work.....");
	}
}
