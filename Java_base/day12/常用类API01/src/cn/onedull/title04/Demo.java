/*
���󣺴���BigDecimal ��Ķ��󣬲����ó��÷���

����:
(1)����һ��Demo��, ����BigDecimal
(2)ʹ��BigDecimal����ط������мӼ��˳�

�ܽ�:
(1)BigDcimal����Խ��float��double���ܱ�ʾ��ȷС��������
*/
package cn.onedull.title04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
	public static void main(String[] args) {
		//����BigDecimal
		BigDecimal num1 = new BigDecimal("0.9");
		BigDecimal num2 = new BigDecimal("0.7");
		
		//���
		BigDecimal sum = num1.add(num2);
		System.out.println(sum);
		//���
		BigDecimal sub = num1.subtract(num2);
		System.out.println(sub);
		//���
		BigDecimal mul = num1.multiply(num2).setScale(1, RoundingMode.HALF_UP);
		System.out.println(mul);
		//���(С��λֻ����λ��, ��������)
		//BigDecimal div = num1.divide(num2); //java.lang.ArithmeticException
		BigDecimal div = num1.divide(num2, 2, RoundingMode.HALF_UP);
		System.out.println(div);
	}
}
