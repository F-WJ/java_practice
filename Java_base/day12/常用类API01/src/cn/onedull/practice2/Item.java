package cn.onedull.practice2;

public class Item {
	//��Ʒ����
	private String name;
	//��Ʒ�۸�
	private double price; //BigDecimal
	
	
	//�޲ι�����
	public Item() {
		
	}
	
	//�вι�����
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//setter��getter����
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
