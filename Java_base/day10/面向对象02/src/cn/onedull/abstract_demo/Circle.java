package cn.onedull.abstract_demo;

public class Circle extends AbstractGraph{
	private double r;
	
	public double getR(){
		return r;
	}
	public void setR(double r){
		this.r = r;
	}
	
	double getArea(){
		return 3.14 * r * r;
	}
}
