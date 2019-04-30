/*
3:String[] arr = {"name","age","price"}
 将字符串中每个单词的首字母大写,其余小写,然后替换在原数组
 
步骤:
(1)定义String类型arr
(2)利用for加substring, toUpperCase, toLowerCase来把字符串首字母大写, 其余小写
(3)打印数组

总结:
(1)运用toUpperCase和toLowerCase方法可以将字母大小写
*/
package cn.onedull.string03;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		//定义字符串
		String[] arr = {"name","age","price"};
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
		}
		//打印
		System.out.println(Arrays.toString(arr));
	}

}
