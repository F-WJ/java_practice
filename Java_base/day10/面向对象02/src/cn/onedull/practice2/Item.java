package cn.onedull.practice2;

public class Item {
	private String code;  //���
	private String name;  //����
	private String type;  //���
	private double price; //�۸�
	
	//�޲ι�����
	public Item(){
		
	}
	//�вι�����
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
		System.out.println("���: " + code);
		System.out.println("����: " + name);
		System.out.println("����: " + type);
		System.out.println("�۸�: " + price);
	}
	
}
