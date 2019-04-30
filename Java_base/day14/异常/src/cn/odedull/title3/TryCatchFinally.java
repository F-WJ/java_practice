/*
需求：演示捕获多个异常try-catc-finally 的使用

步骤:
(1)定义一个divide方法, 计算两个参数的除, 设置try-catch-finally异常设置
(2)在main方法中调用方法, 测试

总结:
(1)finally无论是否存在错误, finally块都会执行
(2)如果在try语句块或者catch语句块存在JVM退出代码( System.exit(0);), 
	finally块不会被执行.
*/

package cn.odedull.title3;

public class TryCatchFinally {

	public static void main(String[] args) {
		divide(5, 0);
	}
		
	static void divide(int a, int b) {
		try {
			int div = a / b;
		}catch(Exception e) {
			System.out.println("除数不能为0");
			//System.exit(0);
		}
		finally {
			System.out.println("下一题");
		}
	}
	

}
