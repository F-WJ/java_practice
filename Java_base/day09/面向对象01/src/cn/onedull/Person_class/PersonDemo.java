/*
2. 根据以下信息，定义类创建对象
孙悟空
字段：name，age，武器(weapon)，紧箍咒(formula)
方法：吃斋(doMaigre)，念佛(buddha)，取经(doPilgrimage)，战斗(fight), 降妖exterminate devil
--> (extDevil)
猪八戒
字段：name，age，武器,媳妇(wife)，
方法，念佛，取经，战斗, 牵马holding horses ---> (holdHorse)
沙和尚
字段：name，age，武器, 流沙河(sandRiver)，
方法:念佛，取经，战斗, 挑行李Pick up the luggage --> pickUpLuge

步骤:
(1)创建一个类(整体描述)
(2)创建三个对象
(3)使用setter方法赋值
(4)调用所需方法

总结:
(1)封装减少了代码的重复性.
 */
package cn.onedull.Person_class;

public class PersonDemo {
	public static void main(String[] args){
		//创建monkey对象
		Animal monkey = new Animal();
		monkey.setName("孙悟空");
		monkey.setAge(999);
		monkey.setWeapon("");
		monkey.doMaigre();
		monkey.buddha();
		monkey.doPilgrimage();
		monkey.fight();
		monkey.extDevil();
		
		//创建对象
		Animal pig = new Animal();
		pig.setName("猪八戒");
		pig.setAge(999);
		pig.setWeapon("");
		pig.buddha();
		pig.doPilgrimage();
		pig.fight();
		pig.holdHorse();
		
		//创建对象
		Animal fish = new Animal();
		fish.setName("沙和尚");
		fish.setAge(999);
		fish.setWeapon("");
		fish.doPilgrimage();
		fish.fight();
		fish.pickUpLuge();
			
		
	}
}
