package cn.onedull.practice1;

public class UseCompute {
	public void useCom(Compute com, int num1, int num2) {
		//调用方法
		int value = com.computer(num1, num2);
		//打印结果
		System.out.println(value);
	}
}


/*
 * 3）设计一个类UseCompute，含有方法：public void useCom(Compute com, int num1,int num2)
 * 此方法要求能够：1．用传递过来的对象调用computer 方法完成运算 2．输出运算的结果
 */