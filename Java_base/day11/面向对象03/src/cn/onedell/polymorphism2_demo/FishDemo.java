/*
需求：定义一个鱼类（Fish）实现会游泳（ISwimable）的接口，创建鱼的多态对象调用游泳
方法
作业目的:
掌握实现关系多态对象的创建
多态对象调用方法的执行流程

步骤:
(1)创建一个接口类(ISwimable), 抽象方法为say
(2)创建一个Fish实现类,  覆盖接口的方法say
(3)创建测试类(FishDemo), 创建实现类对象, 调用swim方法.

总结:
(1)多态调用顺序为先在父类寻找某一方法, 如果有的话, 编译不报错, 然后又到子类找, 如果找到, 调用子类同样方法名的方法
 */
package cn.onedell.polymorphism2_demo;

public class FishDemo {

	public static void main(String[] args) {
		//实现类
		Fish fish = new Fish();
		fish.swim();
		
		

	}

}
