/*
定义一个商品类(Item)，拥有私有化的成员变量商品名称(name)，商品价格(price)，请提
供所有成员变量的setter 和getter 方法，并且提供一个无参数的构造器和一个所有参数的构
造器。
现有字段String text="name：移动硬盘；price：58.0"，请通过常用类的相关方法利用文本text
的信息创建一个对应Item 对象。
分析：
1，将字符串进行拆分
2，拆分后的字符串转换成和商品类(Item)字段类型相同的数据
3，将转换后的数据保存到对象中

步骤:
(1)创建Item类, 创建两个私有变量商品名称(name), 商品价格(price), 创建一个无参构造器, 和一个有草
 	参数的构造器.
(2)创建测试类, 创建一个字符串, 利用indexOF和substring方法, 来筛选出想要的信息

总结:
(1)通过substring来切取想要的字符串信息.
*/
package cn.onedull.practice2;

public class ItemDemo {

	public static void main(String[] args) {
		String str = "name：移动硬盘；price：58.0";
		
		//第一次
		int x = str.indexOf("：");
		int y = str.indexOf("；");
		String name = str.substring(x + 1, y).trim();
		System.out.println(name);
		//第二次
		String newstr = str.substring(y + 1);
		int x2 = newstr.indexOf("：");
		String price = newstr.substring(x2 + 1).trim();
		Double d = Double.valueOf(price);
		System.out.println(price);
		
		//创建对象
		Item item = new Item(name, d);
		System.out.println(item.getName() + ": " + item.getPrice());
		
		
		
	}

}
