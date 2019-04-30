/*
需求：演示捕获多个异常try-catc-catch 的使用

步骤:
(1)定义一个divide方法, 计算传入两个字符串转换之后, 除的结果, 设置try-catch-atch异常
(2)在main方法中调用divide方法, 测试


总结:
(1)当异常发生时, 会执行相对应的cache语句, 不会同时有多个异常同时发生
*/
package cn.odedull.title2;

public class TryCatchCathDemo {
	public static void main(String[] args) {
		divide("5" , "0a");
	}



	static void divide(String str1, String str2) {
		try {
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int div = num1 / num2;
		}catch(ArithmeticException e) {
			System.out.println("除数不能为0");
		}catch(NumberFormatException e) {
			System.out.println("输入数字");
		}catch(Exception e) {
			System.out.println("未知问题");
		}
	}


}
