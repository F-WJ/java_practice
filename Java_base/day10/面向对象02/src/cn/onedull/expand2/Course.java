package cn.onedull.expand2;

public class Course {
	//成员变量
	private String name;
	private double score;
	
	public Course(){
		
	}
	
	public Course(String name, double score) {
		this.name = name;
		this.score = score;
	
	}
	//setter和getter方法
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getScore(){
		return score;
	}
	public void setScore(double score){
		this.score = score;
	}
	

}
