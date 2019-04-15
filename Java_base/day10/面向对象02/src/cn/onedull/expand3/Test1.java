/*
 自定义类作为一个另一个类的成员变量
 */
package cn.onedull.expand3;

public class Test1 {
	private int[] arr;
	private Test2 test2;  //成员变量test2
	
	public Test1() {
		
	}
	//有参构造器
	public Test1(int[] arr) {
		this.arr = arr;
	}
	
	public Test1(Test2 test2) {
		this.test2 = test2;
	}
	
	
	
	//Test2类
	public Test2 getTest2() {
		return test2;
	}
	public void setTest2(Test2 test2) {
		this.test2 = test2;
	}
	
	
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
		System.out.println("set方法中arr值: "+ arr); // set方法中arr值: [I@659e0bfd
	}
}
