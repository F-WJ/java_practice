/*
需求：使用StringBuilder 拼接字符串

步骤:
(1)创建Demo类, 创建StringBuilder类, 调用append方法

总结:
(1)使用StringBuilder类, 提高代码运行效率.
*/
package cn.onedull.title07;

public class Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		//创建int类型数组
		int[] arr = new int[100000];
		sb.append("[");
		for(int index = 0; index < arr.length; index++) {
			if(index == arr.length - 1) {
				sb.append(arr[index]).append("]");
			}
			else {
				sb.append(arr[index]).append(", ");
			}
		}
		System.out.println(sb.toString());
	}
	
	//java.lang.OutOfMemoryError
		

}
