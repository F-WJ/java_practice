/*
需求：创建BigDecimal 类的对象，并调用常用方法

步骤:
(1)创建一个Demo类, 创建BigDecimal
(2)使用BigDecimal类相关方法进行加减乘除

总结:
(1)BigDcimal类可以解决float和double不能表示精确小数的问题
*/
package cn.onedull.title04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
	public static void main(String[] args) {
		//创建BigDecimal
		BigDecimal num1 = new BigDecimal("0.9");
		BigDecimal num2 = new BigDecimal("0.7");
		
		//相加
		BigDecimal sum = num1.add(num2);
		System.out.println(sum);
		//相减
		BigDecimal sub = num1.subtract(num2);
		System.out.println(sub);
		//相乘
		BigDecimal mul = num1.multiply(num2).setScale(1, RoundingMode.HALF_UP);
		System.out.println(mul);
		//相除(小数位只留两位数, 四舍五入)
		//BigDecimal div = num1.divide(num2); //java.lang.ArithmeticException
		BigDecimal div = num1.divide(num2, 2, RoundingMode.HALF_UP);
		System.out.println(div);
	}
}
