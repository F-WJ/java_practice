//徒弟类
package cn.onedull.practice1;

public class Person {
	private String name;  //名字
	private int age;  //年龄
	private String weapon;  //武器
	
	public Person(){
		
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
	public String getWeapon(){
		return weapon;
	}
	public void setWeapon(String weapon){
		this.weapon = weapon;
	}
	
	void message(){
		System.out.println("姓名: " + name);
		System.out.println("年龄: " + age);
		System.out.println("武器: " + weapon);
		System.out.print("技能:");
	}
	
	//念佛
	void buddha(){
		System.out.print(" 念佛 ");
	}
	
	//取经
	void doPilgrimage(){
		System.out.print(" 取经 ");
	}
	
	void fight(){
		System.out.print(" 战斗 ");
	}
	
	void extDevil(){
		System.out.print(" 降妖 ");
	}

}
