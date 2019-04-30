package cn.onedull.practice2;

public class Item {
	//商品名称
	private String name;
	//商品价格
	private double price; //BigDecimal
	
	
	//无参构造器
	public Item() {
		
	}
	
	//有参构造器
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//setter和getter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
