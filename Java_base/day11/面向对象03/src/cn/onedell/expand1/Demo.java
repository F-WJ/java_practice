/*
 现有交通工具(Seater)，出租车（Taxi），客机（Airliner），客船（Ship）都属于交通工具，
各交通工具都有品牌(brand)，载客行为（manned）。客机实现了飞天的功能（IFly），出租
车实现了道路上跑的功能（IRun），客船实现了游的功能（ISwim）。
要求：
1)用继承和接口，模拟各交通工具和功能的关系，功能用接口。
2)请在测试类的main 方法中用多态的知识，打印“出租车开始跑了”,“飞机开始飞天
了”,“船舶开始在海洋中漂泊了”，“我是大众捷达出租车，有载客行为”，“我是波音飞机，
有载客行为”，“我是泰但尼克号，有载客行为”。

步骤:
(1)创建爱一个接口通用类, 实现类是fly, swim, run类
(2)创建一个功能类function. 调用通用接口类
(3)创建一个交通工具类seater, 定义品牌, 载客行为, 名字变量, 继承功能类function
(4)创建测试类demo, 创建交通工具对象,  调用方法

总结:
(1)利用一个通用接口, 可以让主方法代码简洁, 直接创建功能,然后赋值
 */
package cn.onedell.expand1;

public class Demo {
	public static void main(String[] args) {
		Seater taxi = new Seater();
		taxi.setTool("出租车");
		taxi.print1();
		IFunction run = new Run();
		taxi.function(run);
		taxi.setManned("载客行为");
		taxi.setBrand("大众捷达");
		taxi.print2();
		
		System.out.println("---------------------");
		
		Seater airliner = new Seater();
		airliner.setTool("飞机");
		airliner.print1();
		IFunction fly = new Fly();
		airliner.function(fly);
		airliner.setManned("载客行为");
		airliner.setBrand("波音");
		airliner.print2();
		
		System.out.println("---------------------");
		
		Seater ship = new Seater();
		ship.setTool("客船");
		ship.print1();
		IFunction swim = new Swim();
		ship.function(swim);
		ship.setManned("载客行为");
		ship.setBrand("泰但尼克号");
		ship.print2();
		
		System.out.println("---------------------");
	}
}
