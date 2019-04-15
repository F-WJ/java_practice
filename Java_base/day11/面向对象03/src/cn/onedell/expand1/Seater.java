package cn.onedell.expand1;

public class Seater extends Function{
	private String tool;
	private String brand;
	private String manned;
	
	public Seater() {
		
	}
	
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManned() {
		return manned;
	}
	public void setManned(String manned) {
		this.manned = manned;
	}
	
	void print1() {
		System.out.print(tool + "开始");
	}
	void print2() {
		System.out.println("我是" + brand + tool + ", 有" + manned);
	}

	
}
