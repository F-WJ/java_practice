package cn.onedull.extends_demo;

public class Teacher extends Person {
	private String level;
	
	public Teacher(){
		
	}
	
	void schoolTeach(){
		System.out.println("ÊÚ¿Î");
	}
	
	public String getLevel(){
		return level;
	}
	public void setLevel(String level){
		this.level = level;
	}
}
