/*
2:String[] str = {"1+2","1+2","23+34","12+1+1+1"};
 计算 str数组中所有 数值的 和
  
步骤:
(1)定义一个String类型数组和一个int类型变量sum
(2)利用for循环和String类的split方法, 拆分每个数字
(3)利用Integer类的parseInt方法, 把字符串转换为int类型

总结:
(1)split比subring方法更加便利
*/
package cn.onedull.string02;

public class Demo {

	public static void main(String[] args) {
		//定义字符串  
		String[] str = {"1+2","1+2","23+34","12+1+1+1"};
		//总和
		int sum = 0;
		//for循环
		for(String ele : str) {
			for(String num : ele.split("\\+")){
				sum = sum + Integer.parseInt(num);
			}
		}
		System.out.println(sum);
		
	}

}
