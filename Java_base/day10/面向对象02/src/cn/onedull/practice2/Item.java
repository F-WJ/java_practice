package cn.onedull.practice2;

public class Item {
	private String code;  //编号
	private String name;  //名称
	private String type;  //类别
	private double price; //价格
	
	//无参构造器
	public Item(){
		
	}
	//有参构造器
	public Item(String code, String name){
		this.code = code;
		this.name = name;
	}
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code = code;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	void main(){
		System.out.println("编号: " + code);
		System.out.println("名称: " + name);
		System.out.println("类型: " + type);
		System.out.println("价格: " + price);
	}
	
}
