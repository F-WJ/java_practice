package cn.onedull.abstract_demo;

public class Rectangle extends AbstractGraph{
	private int height;
	private int width;
	
	public int getHigh(){
		return height;
	}
	public void setHigh(int height){
		this.height = height;
	}
	
	public int getWidth(){
		return width;
	}
	public void setWidth(int width){
		this.width = width;
	}
	
	double getArea(){
		return height * width;
	}
	

	
}
