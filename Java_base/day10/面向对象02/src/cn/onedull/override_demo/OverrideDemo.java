/*
�?求：演示方法覆盖
�? 父类鸟类（Bird），鸟类中含有飞翔（fly）行�?
�? 鸟的子类鸵鸟类（Ostrich），子类中覆盖父类飞翔（fly）方�?

步骤:
(1)先创建一个父类Bird, 里面有成员方法fly
(2)再创建子类Ostrich, 编写�?个fly成员方法, 覆盖fly方法
(3)创建测试�?(OverrideDemo), 创建Ostrich对象, 并调用成员方法fly

总结:
(1)方法覆盖记住�?�?, 如果要覆盖父类方�?, 请直接复制该方法到子类上, 然后修改方法�?, 防止报错.
 */
package cn.onedull.override_demo;

public class OverrideDemo {

	public static void main(String[] args) {
		Ostrich a = new Ostrich();
		a.fly();

	}

}
