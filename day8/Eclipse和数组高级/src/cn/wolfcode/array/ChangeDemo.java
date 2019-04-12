/*
 * 需求：定义一个方法transfer(int[] arr, int index1, int index2)实现交换数组arr 中索引为index1
 * 和index2 对应元素的值。
 * 步骤:
 * (1)定义一个transfer方法, 参数为一个int类型数组和两个索引
 * (2)方法体内容为关于两个元素对换代码
 * (3)不用返回
 * 
 * 总结:
 * (1)数组交换元素, 等于重新设置某一索引的值
 */
package cn.wolfcode.array;

import java.util.Arrays;

public class ChangeDemo {
	public static void main(String[] args)
	{
		//定义int类型数组并初始化]
		int[] arr = new int[]{1, 2, 3, 4};
		//调用方法
		ChangeDemo.transfer(arr, 0, 3);
		//打印
		System.out.println(Arrays.toString(arr));
			
		
	}

	static void transfer(int[] arr, int i, int j) {
		//交换
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
}
