/*
步骤:
(1)创建一个Message类
(2)定义private修饰符成员变量
(3)创建getter和setter方法
 */
package cn.onedull.message_class;

public class Message {
	private String name;
	private int age;
	private String gender;
	private int enScore;
	private int mathScore;
	private int cnScore;

	
	//无参构造器
	public Message(){
		
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
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public int getEnScore(){
		return enScore;
	}
	public void setEnScore(int enScore){
		this.enScore = enScore;
	}
	
	public int getMathScore(){
		return mathScore;
	}
	public void setMathScore(int mathScore){
		this.mathScore = mathScore;
	}
	
	public int getCnScore(){
		return cnScore;
	}
	public void setCnScore(int cnScore){
		this.cnScore = cnScore;
	}
	
	
}
