package cn.onedull.practice02;

public class Person {
	private String name;         //����
	private String address;      //��ַ
	
	public Person() {
		super();
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

//���һ������addSalary��Ϊ�ǹ��ʣ���ͨԱ��һ������10������������20��
//Person���е������У�����name(String����)����ַaddress(String����)���������Ĺ��췽���� 