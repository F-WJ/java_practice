package cn.onedull.expand2;

public class Course {
	//��Ա����
	private String name;
	private double score;
	
	public Course(){
		
	}
	
	public Course(String name, double score) {
		this.name = name;
		this.score = score;
	
	}
	//setter��getter����
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
