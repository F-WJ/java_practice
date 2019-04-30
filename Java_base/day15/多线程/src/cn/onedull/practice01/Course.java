package cn.onedull.practice01;

public class Course {
	private String course;
	private int score;
	
	
	
	public Course(String course, int score) {
		super();
		this.course = course;
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}


//课程名称：语文，语文成绩：88