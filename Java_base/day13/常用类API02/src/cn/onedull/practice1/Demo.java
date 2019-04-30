/*利用接口的知识，写个计算器，能完成两个数的加减乘除运算

步骤:
1）定义一个接口Compute 含有一个方法int computer(int n,int m);
2）定义加（Add）、减（Subtract）、乘（Multiply）、除（Divide）四个类,分别实现此接
口，并分别覆盖computer 方法完成加减乘除运算
3）设计一个类UseCompute，含有方法：public void useCom(Compute com, int num1,int
num2)
此方法要求能够：
1．用传递过来的对象调用computer 方法完成运算
2．输出运算的结果
4）设计一个测试类，调用UseCompute 中的方法useCom 来完成加减乘除运算

总结:
(1)类作为方法的参数, 传递的是类的地址值
*/
package cn.onedull.practice1;


public class Demo {
	public static void main(String[] args) {
		//调用方法
		UseCompute uc = new UseCompute();
		//调用方法
		uc.useCom(new Add(), 4, 5);       //加
		uc.useCom(new Divide(), 4, 5);    //除
		uc.useCom(new Multiply(), 4, 5);  //乘
		uc.useCom(new Subtract(), 4, 5);  //减
   	}

	
	
	
}
