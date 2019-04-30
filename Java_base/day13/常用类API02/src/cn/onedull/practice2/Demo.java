/*现有两个打印规范如下：
字母小写打印（ILowercaseLetter），方法：void printLowercaseLetter()
字母大写打印(IUppercaseLetter)，方法：printUppercaseLetter()
1)现有打印类Print 实现ILowercaseLetter 和IUppercaseLetter 规范。
2)要求覆盖printUppercaseLetter()方法实现为：将成员变量str 转换并打印为全大写英文字母
的功能，覆盖printLowercaseLetter()方法实现为：将成员变量str 转换并打印为全小写英文字
母的功能。
【提示：（码表65 为A，码表97 为a）】
请用多态的知识创建对象，并调用大小写打印方法。

步骤:
(1)定义ILowercaseLetter和ILowercaseLetter接口
(2)定义一个Print类, 并实现ILowercaseLetter 和IUppercaseLetter, 覆盖两个接口的抽象方法
(3)定义一个测试类Demo, 利用多态创建对象, 调用方法

总结:
(1)使用String类的toUpperCase和toLowerCase方法可以快速判断大小写.
*/
package cn.onedull.practice2;

public class Demo {

	public static void main(String[] args) {
		String str = "dadasdad";
		//创建对象
		ILowercaseLetter lower = new Print();
		lower.printLowercaseLetter(str);
		IUppercaseLetter up = new Print();
		up.printUppercaseLetter(str);
	}

}
