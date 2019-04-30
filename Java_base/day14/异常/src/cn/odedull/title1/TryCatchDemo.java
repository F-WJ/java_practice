/*
需求：演示捕获单个异常try-catch 的使用


步骤:
(1)定义一个divide方法,  计算传入两个参数,  设置try-catch异常
(2)在main方法中调用divide方法, 测试

总结:
(1)异常一旦发生, catch语句块会执行
*/
package cn.odedull.title1;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		divide(5, 0);
	}
	
	static void divide(int a , int b) {
		try {
			int div = a / b;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
			// 能知道哪一行出错
			e.printStackTrace();
		}
	
		
		
	}

}
