package cn.onedull.extends_demo;

public class Employee extends Person {
	private String cometime;
	
	public Employee(){
		
	}
	
	void work(){
		System.out.println("นคื๗");
	}
	
	public String getCometime(){
		return cometime;
	}
	public void setCometime(String cometime){
		this.cometime = cometime;
	}
	
	
}
