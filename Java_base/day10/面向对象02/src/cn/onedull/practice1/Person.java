//ͽ����
package cn.onedull.practice1;

public class Person {
	private String name;  //����
	private int age;  //����
	private String weapon;  //����
	
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
		System.out.println("����: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + weapon);
		System.out.print("����:");
	}
	
	//���
	void buddha(){
		System.out.print(" ��� ");
	}
	
	//ȡ��
	void doPilgrimage(){
		System.out.print(" ȡ�� ");
	}
	
	void fight(){
		System.out.print(" ս�� ");
	}
	
	void extDevil(){
		System.out.print(" ���� ");
	}

}
