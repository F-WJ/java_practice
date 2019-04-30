/*
集合使用.
①写一个点类Point, 有X,Y 坐标.
②创建5 个Point 对象, 添加到list 集合ArrayList 中
③删除索引为2 的点对象
④再把list 合集中索引为3 的点对象修改成坐标X=3,Y=3 的点对象
⑤遍历list 集合对象并打印输出该list 对象

步骤:
(1)创建Point类, 成员变量坐标X(int类型),  坐标Y(int类型)
(2)定义测试类Demo, 创建ArrayList对象,
(3)调用add方法添加Point对象
(4)调用remove方法删除指定索引
(5)利用foreach遍历集合元素

总结:
(1)ArrayList遍历元素可以直接使用foreach.
*/
package cn.onedull.practice01;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		//调用add添加Point对象
		list.add(new Point(1, 2));
		list.add(new Point(1, 3));
		list.add(new Point(2, 6));
		list.add(new Point(3, 9));
		list.add(new Point(5, 4));
		
		
		try {
			//删除索引为2 的点对象
			list.remove(2);
			//再把list 合集中索引为3 的点对象修改成坐标X=3,Y=3 的点对象
			Point p = list.get(3);
			p.setX(3);
			p.setY(3);
		}catch(IndexOutOfBoundsException e){
			System.out.println("超出索引范围");
		}
		
		//遍历list 集合对象并打印输出该list 对象
		for(Point ele : list) {
			System.out.println(ele);
		}
		
		
		System.out.println(list);
	}

}
