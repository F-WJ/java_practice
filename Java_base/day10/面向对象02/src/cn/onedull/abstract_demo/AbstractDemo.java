/*
�?求：分别求出圆形和矩形的面积
�? 矩形（Rectangle）：求出矩形的面�?
�? 圆形（Circle）：求出圆形的面�?
�? 图形（AbstractGraph）：表示求形状面积的抽象类，里面包含求面积的抽象方法�?
其他子类必须覆盖此方�?

步骤:
(1)先创建NoAbstract�?(父类)和Abstract�?(父类), 两�?�差别在于有没有使用抽象类和抽象方法
	成员方法为area方法, 求面�?
(2)在分别创建Rectangle(矩形)�?(子类), Circle(圆形)�?(子类), AbstractGraph(图形)�?(子类) 
	, 三个都继承父类和覆盖父类的方�?.
(3)创建测试类AbstractDemo, 创建矩形和圆形对�?, 设置�?, 打印结果

总结�?
(1)抽象方法是没有方法体的并要求子类覆盖抽象方法
(2)子类必须覆盖父类抽象方法, 不然会报�?.
 */
package cn.onedull.abstract_demo;

public class AbstractDemo {

	public static void main(String[] args) {
		//创建矩形对象
		Rectangle rectangle = new Rectangle();
		rectangle.setHigh(2);
		rectangle.setWidth(4);
		double r = rectangle.getArea();
		System.out.println(r);
		
		//创建圆形对象
		Circle circle = new Circle();
		circle.setR(1);
		double c = circle.getArea();
		System.out.println(c);
	}
		
	

	
}
