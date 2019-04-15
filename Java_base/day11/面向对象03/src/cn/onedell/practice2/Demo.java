/*
某公司旗下有三种型号（model）机器人（Roboot） A 、B、C，他们都具有姓名name, 型
号model 和走路功能walk。其中A 实现了说话功能speak ，B 实现了图像识别功能see，
C 同时实现了说话和识别功能。请利用继承、接口、多态等知识完成类的设计并编写测试
Demo

步骤:
(1)创建一个接口ISkill, 继承接口IWalk(走路), ISpeak(说话), 图像识别(ISee)
(2)创建实现类
(3)创建测试类(Demo), 调用方法, 打印结果

总结:
(1)一旦使用接口, 无法使用接口没有的方法, 通过继承父类也不行
 */
package cn.onedell.practice2;

public class Demo {

	public static void main(String[] args) {
		ISkill skill = new Skill();
		Roboot roboot1 = new Roboot();
		roboot1.setName("A");
		roboot1.setmodel("model");
		System.out.println(roboot1.getModel() + " , " + roboot1.getName());
		skill.speak();
		
		System.out.println("-------------------------");
		Roboot roboot2 = new Roboot();
		roboot2.setName("B");
		roboot2.setmodel("model");
		System.out.println(roboot2.getModel() + " , " + roboot2.getName());
		skill.see();
		
		System.out.println("--------------------------");
		Roboot roboot3 = new Roboot();
		roboot3.setName("C");
		roboot3.setmodel("model");
		System.out.println(roboot3.getModel() + " , " + roboot3.getName());
		skill.speak();
		skill.see();
		
		
		
	}

}
