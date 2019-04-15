/*
需求: 演示自动类型转换
步骤:
(1)int类型转换为long
(2)long类型转换为flaot
(3)类型的自动提升
	int类型的值和int类型的值相加,定义变量接收两个变量之和
	byte类型的值和int类型的值相加,定义变量接收两个变量之和
	byte类型的值和byte类型的值相加,定义变量接收两个变量之和
	char 类型的值和int 类型的值相加，定义变量接收两个变量之和
	int、float、double、long 类型的值相加，定义变量接收所有变量之和

总结: 
(1)自动转换规则: byte, short, char --> int --> long --> float --> double
(2)在算术运算时,byte,short,char自动提升到int类型
(3)运算最终结果,最终类型由表达式中类型最高类型决定
*/
public class TypeConvertDemo1
{
	public static void main(String[] args)
	{
		//int类型转换long类型
		long index = 1;
		//long类型转换float类型
		float f1 = index;
		
		//类型自动提升
		int a = 1;
		int b = 2;
		byte c = 3;
		char d = 4;
		float f2 = 3.14F;
		double d1 = 3.14;
		//int和int相加
		int demo = a + b;
		//byte和int相加
		int demo1 = a + c;
		//byte和byte相加
		int demo2 = c + c;
		//char和int相加
		int demo3 = d + a;
		//int,float,double,long相加
		double demo4 = a + c + f2 + d1;
	}
}