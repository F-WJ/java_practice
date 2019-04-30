/*
需求：定义一个Point 类，并为Point 类定义泛型和使用泛型

步骤:
(1)定义Point类, 类型定义泛型
(2)在main方法中创建Point对象

总结:
(1)
*/
package cn.onedull.title06;

public class PointDemo {

	public static void main(String[] args) {
		//创建Point对象
		Point<String> point = new Point<String>();
		point.setName("小月");
	}

}


class Point<E> {
	private E name;
	
	public Point() {
		
	}
	
	
	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
}
