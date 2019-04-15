package cn.onedull.Person_class;

public class Animal {
	private String name;
	private int age;
	private String weapon;
	
	//getter方法
	public String getName(){
		return name;
	}
	
	//setter方法
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getWeapon(){
		return weapon;
	}
	
	public void setWeapon(String weapon){
		this.weapon = weapon;
	}
	
	//吃斋方法
	void doMaigre(){
		System.out.println("吃斋");
	}
	
	//念佛神技
	void buddha(){
		System.out.println("念佛");
	}
	
	//取经大法
	void doPilgrimage(){
		System.out.println("取经");
	}
	
	//战斗
	void fight(){
		System.out.println("战斗");
	}
	
	//降妖
	void extDevil(){
		System.out.println("降妖");
	}
	
	//挑行李
	void pickUpLuge(){
		System.out.println("挑行李");
	}
	
	//牵马
	void holdHorse(){
		System.out.println("牵马");
	}
	
	
	
	
	
}
