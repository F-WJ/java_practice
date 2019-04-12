/*
需求：
演示package 和import 关键字
步骤：
（1）使用eclipse 创建一个包
（2）创建类
（3）调用Arrays 中的toString 来打印数组的元素
（4）引入Arrays 类 


总结:
(1)使用toString方法, 减少代码量
 */
package cn.wolfcode.array;

import java.util.Arrays;
public class PrintArrayDemo {

	public static void main(String[] args) {
		int[] arr = new int[]{10,20,30,40};
		String str = Arrays.toString(arr);
		System.out.println(str);
	}

}
