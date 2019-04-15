package cn.onedull.cat_class2;

public class Cat {
	String name;
	int  age;
	
	//无参构造器
	public Cat(){
		
	}
	
	//自定义构造器
	public Cat(String i, int j){
		name = i;
		age = j;
	}
	
	//成员方法
	void say(){
		System.out.println(name + " : (>^ω^<)喵");
	}
}
