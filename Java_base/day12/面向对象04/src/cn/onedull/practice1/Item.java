package cn.onedull.practice1;

public class Item {
	private String code;  //商品编号
	private String name;  //商品名称
	private String type;  //商品的具体类别
	private double price; //商品的价格
	static int totalNum;  //商品的总商品数量
	
	//无参构造器
	public Item() {
		
	}
	
	//有参构造器
	public Item(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void main(String code, String name, String type, double price) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.price = price;
		Item.totalNum++;
		System.out.println("编号(code): " + code);
		System.out.println("名称:  " + name);
		System.out.println("类型: " + type);
		System.out.println("价格: " + price);
		System.out.println("总商品数量: " + totalNum);
		System.out.println("--------------------------------------");
		
	}
}
