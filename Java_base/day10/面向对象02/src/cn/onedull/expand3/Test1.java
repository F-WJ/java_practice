/*
 �Զ�������Ϊһ����һ����ĳ�Ա����
 */
package cn.onedull.expand3;

public class Test1 {
	private int[] arr;
	private Test2 test2;  //��Ա����test2
	
	public Test1() {
		
	}
	//�вι�����
	public Test1(int[] arr) {
		this.arr = arr;
	}
	
	public Test1(Test2 test2) {
		this.test2 = test2;
	}
	
	
	
	//Test2��
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
		System.out.println("set������arrֵ: "+ arr); // set������arrֵ: [I@659e0bfd
	}
}
