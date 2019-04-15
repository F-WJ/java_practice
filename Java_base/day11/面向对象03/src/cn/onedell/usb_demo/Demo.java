/*
需求：模拟在主板（MotherBoard）上安装鼠标（Mouse）、键盘（KeyBoard）等，比较没有
规范和有规范的区别

步骤:
(1)创建一个通用接口(IUSB), 抽象方法为usb
(2)创建两个实现类鼠标(Miouse)和键盘(KeyBoard). 覆盖接口的抽象方法
(3)创建一个测试类, 创建对象, 调用主板类plugin方法

总结:
(1)通过创建一个通用的接口, 更加规范化
 */

package cn.onedell.usb_demo;

public class Demo {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		KeyBoard kb = new KeyBoard();
		
		//插入usb接口
		MotherBoard mb = new MotherBoard();
		mb.plugin(m);
		mb.plugin(kb);
		
		

	}

}
