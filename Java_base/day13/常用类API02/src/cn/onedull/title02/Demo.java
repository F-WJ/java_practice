/*
使用随机数Random 类，通过Random 类获取伪随机数

步骤:
(1)调用Random类中的nextInt方法


总结:
(1)Random类主要用于生产伪随机数.
*/
package cn.onedull.title02;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100);   //100以内随机数
		System.out.println(num);
	}

}
