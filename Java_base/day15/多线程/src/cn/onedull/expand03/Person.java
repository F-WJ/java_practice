package cn.onedull.expand03;

public class Person {
	Gun gun = new Gun();
	
	public void shoot() {
		gun.pop();
	}
}


/*
 * Person 类有一个实例方法 shoot 方法， 调用 Gun 中 方法 pop，
 */