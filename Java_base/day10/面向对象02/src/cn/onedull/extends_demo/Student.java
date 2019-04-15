package cn.onedull.extends_demo;

public class Student extends Person{
	private int sn;
	
	public Student(){
		
	}
	
	void study(){
		System.out.println("ѧϰ" + this.getAge());
	}
	
	public int getSn(){
		return sn;
	}
	public void setSn(int sn){
		this.sn = sn;
	}
	
	
}
