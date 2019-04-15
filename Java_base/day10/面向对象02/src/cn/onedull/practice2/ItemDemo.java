/*
需求:
商品类: Item
具有成员变量,
编号(code) String 类型商品编号
名称(name) String 类型商品名称
类别(type) String 类型商品的具体类别
价格(price) double 类型商品的价格
1)提供两个构造器
·没有参数的构造器
·创建一个以编号(c),名称(n) 作为形式参数的构造器
2)编写一个main 方法,添加一个商品,其商品信息如下
创建两个笔记本电脑的商品(computer)

步骤:
(1)创建一个Item类, 成员变量为code(编号), name(名称), type(类别), price(价格), 成员方法为main
(2)创建测试类ItemDemo类, 创建Item对象, 通过调用getter方法设置值, 最后调用main方法

总结:
(1)通过有参数构造器初始化只能初始化一次
(2)通过使用main方法, 把所需要打印信息方法类中, 减少主方法里代码量
 */
package cn.onedull.practice2;

public class ItemDemo {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setCode("666");
		item1.setName("戴尔笔记本");
		item1.setType("游戏");
		item1.setPrice(5499.00);
		item1.main();
		
		
		System.out.println("---------------------------");
		Item item2 = new Item();
		item2.setCode("007");
		item2.setName("苹果笔记本");
		item2.setType("电脑, 办公");
		item2.setPrice(18000.00);
		item2.main();
		
	}

}
