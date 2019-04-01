/*
需求:演示算术运算符
步骤:
(1)定义两个变量,分别求出和差积商(+ - * /)
(2)取模,求余数(%)
(3)演示"+"号表示连接符号的例子
(4)演示8765/1000*1000,说明结果为什么是8000
(5)演示10/0,并说明报错原因
(6)演示前置++
(7)演示后置++

总结:
(1)前置++和后置++区别: 一个先增加后使用,另一个先使用后增加
*/
public class ArithmeticOperatorsDemo1
{
	public static void main(String[] args)
	{
		//定义两个int类型变量
		int a = 2;
		int b = 4;
		//分别打印加减乘除余
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(b % a);
		System.out.println("Hello" + 18);
		System.out.println(8700/1000*1000);
		//System.out.println(10 / 0);  //报错:ArithmeticException: / by zero ,不能除以0
		
		// 前置++和后置++区别
		int c1 = 2;
		int d1 = ++c1;
		System.out.println("d1 : " + d1);
		int c2 = 2;
		int d2 = c2++;
		System.out.println("d2 : " + d2);
	}
}