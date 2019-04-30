/*需求：使用Math 类常用方法，例如：获取随机数方法

步骤:
(1)调用Math的方法random


总结:
(1)random方法返回的是大于等于0.0 ，小于1.0 的double类型的值,  是伪随机选择的。
*/
package cn.onedull.title01;

public class Demo {

	public static void main(String[] args) {
		double num = Math.random();
		System.out.println(num);
	}

}
