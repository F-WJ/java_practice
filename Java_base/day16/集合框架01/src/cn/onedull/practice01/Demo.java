/*
集合使用.
①写一个点类Point, 有X,Y 坐标.
②创建5 个Point 对象, 添加到list 集合ArrayList 中
③删除索引为2 的点对象
④再把list 合集中索引为3 的点对象修改成坐标X=3,Y=3 的点对象
⑤遍历list 集合对象并打印输出该list 对象（明天做）

步骤:
(1)定义一个Point类, 成员变量x(int类型), y(int类型)
(2)定义测试类Demo, 创建5个Point对象, 带x和y参数的.
(3)创建ArrayList对象, 利用add方法, get方法添加和修改
(4)利用for循环和size方法遍历list对象

总结:
(1)ArrayList添加对象时, 存入对象的内存地址, 不是对象的数据
*/
package cn.onedull.practice01;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		//创建Point对象
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(5, 6);
		Point p4 = new Point(7, 8);
		Point p5 = new Point(9, 10);
		
		//创建ArrayList对象
		ArrayList list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		//删除索引为2的对象
		list.remove(2);
		
		//把索引为3的对象修改成坐标x-3, y=3
		p3 = (Point)list.get(3);
		p3.setX(3);
		p3.setY(3);
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i).toString());
		}
		
		
		
	}

}
