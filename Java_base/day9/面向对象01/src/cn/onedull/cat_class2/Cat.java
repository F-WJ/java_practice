package cn.onedull.cat_class2;

public class Cat {
	String name;
	int  age;
	
	//�޲ι�����
	public Cat(){
		
	}
	
	//�Զ��幹����
	public Cat(String i, int j){
		name = i;
		age = j;
	}
	
	//��Ա����
	void say(){
		System.out.println(name + " : (>^��^<)��");
	}
}
