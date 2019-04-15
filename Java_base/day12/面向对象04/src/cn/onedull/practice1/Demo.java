/*
需求:
商品类: Item
具有成员变量:
编号(code) String 类型商品编号
名称(name) String 类型商品名称
类别(type) String 类型商品的具体类别
价格(price) double 类型商品的价格
总商品数量（totalNum） int 类型商品的总商品数量
1)提供两个构造器
·没有参数的构造器
·创建一个以编号(code),名称(name) 作为形式参数的构造器
2)编写一个main 方法,添加一个商品,其商品信息如下
创建两个笔记本电脑的商品(computer),
商品1：
编号(code):666
名称: 戴尔(DELL) 游戏笔记本
类型: 游戏
价格: 5499.00
商品2：
编号(code):007
名称: 苹果（Macbook pro）笔记本
类型: 电脑,办公
价格: 18000.00

3）在main 方法打印笔记本电脑(computer)的名称和价格
4）每创建一个商品对象总商品数量（totalNum）加一，请在main 方法中打印totalNum

步骤:
(1)创建一个Item类,  定义四个private修饰商品编号(code), 名称(name), 类别(type), 
	价格(price)成员变量, 一个static修饰总商品数量(totalNum)成员变量, 创建一个有参构造器
(2创建一个在Item类中创建main方法,  用来创建商品
(3)创建测试类Demo, 创建对象, 调用main方法


总结:
(1)当成员变量使用static修饰后, 值会被所有对象所共享
值。
 */
package cn.onedull.practice1;

public class Demo {

	public static void main(String[] args) {
		//创建对象
		Item computer1 = new Item();
		computer1.main("666", "戴尔(DELL)游戏笔记本", "游戏", 5499.00);
		Item computer2 = new Item();
		computer2.main("007", "苹果(Macbook pro)游戏笔记本", "电脑, 办公", 18000.00);

		
	}

}
