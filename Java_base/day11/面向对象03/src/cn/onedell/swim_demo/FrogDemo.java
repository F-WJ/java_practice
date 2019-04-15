/*
需求：定义一个青蛙类（Frog）继承于动物类（Animal），同时实现于会走路（IWalkable），
会游泳（ISwimable）的接口
作业目的：
掌握接口的定义
掌握接口和接口之间的多继承关系
掌握接口和类之间的多实现关系

步骤:
(1)先创建一个子类(Frog)青蛙和父类(Animal)类, 通过extends继承
(2)通过interface修饰创建三个接口IWalkable(走路), (IWimable)游泳, (ISkill)功能类
(3)创建实现类Frog
(4)创建测试类FrogDemo, 创建实现对象, 调用实现类方法

总结:
(1)接口可以多继承接口
(2)接口减少类与类之间的依赖
 */

package cn.onedell.swim_demo;

public class FrogDemo {

	public static void main(String[] args) {
		ISkill Frog = new Frog();
		Frog.walk();
		Frog.swim();
		

	}

}
