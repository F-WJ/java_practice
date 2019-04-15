/*
需求:交换两个变量的值
步骤:
(1)定义一个变量num1,并赋值为10
(2)定义一个变量num2,并赋值为50
(3)定义一个变量temp,作为一个临时变量
(4)使用temp变量交换num1和num2的值,使num1=50, num2=10
	把num1赋给temp,
	把num2赋给num1,
	把temp赋给num2.


总结: 可以改变常量值,前提下在要已经定义数据类型的范围之内
*/

public class ChangeVarDemo
{
	public static void main(String[] args)
	{
		//创建num1,num2, temp变量
		int num1 = 50;
		int num2 = 10;
		int temp;
		
		// num1赋值给temp
		temp = num1;
		//num2赋值给temp
		num1 = num2;
		//temp赋值给num2
		num2 = temp;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}