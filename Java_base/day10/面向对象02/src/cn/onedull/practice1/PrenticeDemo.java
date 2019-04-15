/*
徒弟
孙悟空
字段：name，age，武器(weapon)
方法：吃斋(doMaigre)，念佛，取经(doPilgrimage)，战斗(fight), 降妖exterminate devil
--> (extDevil)
猪八戒
字段：name，age，武器
方法，念佛，取经，战斗, 牵马holding horses ---> (holdHorse)
沙和尚
字段：name，age，武器
方法:念佛，取经，战斗, 挑行李Pick up the luggage --> pickUpLuge
要求：
1、分析上面信息，代码化(用到知识点：1、this 2、super 3、javabean 4、继承)。
2、写测试类Test 测试
3、添加一定的剧情(随意发挥)。

步骤:
(1)创建一个(Person)类(整体描述), 成员变量有name，age，武器(weapon),成员方法有念佛(buddha)，取经(doPilgrimage)，战斗(fight)
(2)创建一个子类(Prentice), 成员方法有降妖(extDevil), 吃斋(doMaigre), 牵马(holdHorse), 挑行李(pickUpLuge)
(3)创建测试类, 分别创建三个Prentice对象, 并设置值, 调用方法, 打印结果


总结:
(1)利用继承extends, 可以减少子类重复值代码
(2)super.方法名, 会调用父类的成员方法
 */
package cn.onedull.practice1;



public class PrenticeDemo {

	public static void main(String[] args) {
		Prentice prentice1 = new Prentice();
		prentice1.setName("孙悟空");
		prentice1.setAge(999);
		prentice1.setWeapon("金箍棒");
		prentice1.message();
		prentice1.doPilgrimage();
		prentice1.buddha();
		prentice1.doMaigre();
		prentice1.fight();
		prentice1.extDevil();
		
		
		System.out.println("\n" + "----------------------");
		
		Prentice prentice2 = new Prentice();
		prentice2.setName("猪八戒");
		prentice2.setAge(1299);
		prentice2.setWeapon("九齿钉钯");
		prentice2.message();
		prentice2.doPilgrimage();
		prentice2.buddha();
		prentice2.fight();
		prentice2.holdHorse();
		        
		System.out.println("\n" + "----------------------");
		
		Prentice prentice3 = new Prentice();
		prentice3.setName("沙和尚");
		prentice3.setAge(799);
		prentice3.setWeapon("降妖宝杖");
		prentice3.message();
		prentice3.doPilgrimage();
		prentice3.buddha();
		prentice3.fight();
		prentice3.pickUpLuge();
		
		System.out.println("\n" + "----------------------");
		//剧情
		System.out.print(prentice2.getName());
		prentice2.extDevil();
		System.out.print(prentice1.getName());
		
		
	}

}
