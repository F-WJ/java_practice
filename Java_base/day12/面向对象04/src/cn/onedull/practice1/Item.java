package cn.onedull.practice1;

public class Item {
	private String code;  //��Ʒ���
	private String name;  //��Ʒ����
	private String type;  //��Ʒ�ľ������
	private double price; //��Ʒ�ļ۸�
	static int totalNum;  //��Ʒ������Ʒ����
	
	//�޲ι�����
	public Item() {
		
	}
	
	//�вι�����
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
		System.out.println("���(code): " + code);
		System.out.println("����:  " + name);
		System.out.println("����: " + type);
		System.out.println("�۸�: " + price);
		System.out.println("����Ʒ����: " + totalNum);
		System.out.println("--------------------------------------");
		
	}
}
