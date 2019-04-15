/*
需求；定义一个方法，传入两个参数，一个double 数组表示多个货品的价格，一个double
类型的折扣，返回货品总价格
步骤：
（1）定义totalPrice方法，使用数组作为参数price和discount(double)
（2）定义方法，使用可变参数作为参数
（3）调用两个方法

总结:
(1)当使用return的时候, 方法的返回类型要和返回值的类型一致
(2)使用可变参数, 必须是方法参数的最后一个
*/
public class VarArgsDemo
{
	static double totalPrice(double[] price, double discount)
	{
		//总数
		double total = 0;
		//for
		for(double ele : price)
		{
			total = total + ele;
		}
		return total * discount;
	}

	//使用可变参数
	static double totalPrice(double discount, double... price)
	{
		double total = 0;
		for(double ele : price)
		{
			total = total + ele;
		}
		return total * discount;
	}

	public static void main(String[] args)
	{
		//定义数组
		double[] price = new double[]{10.0, 20.0};
		//折扣变量
		double discount = 0.8;
		//调用方法
		double a = VarArgsDemo.totalPrice(price, discount);
		//使用了可变参数的方法
		double b = VarArgsDemo.totalPrice(0.8, 10.0, 20.0);
		System.out.println(a);
		System.out.println("------------");
		System.out.println(b);
		
	}
}