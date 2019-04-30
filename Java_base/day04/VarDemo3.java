/*
需求:使用不同的数据类型定义变量
步骤:
(1)定义八大基本类型数据的变量,并打印
(2)定义引用数据类型String的变量,并打印

总结: 注意float类型的值后面要加上F
*/
public class VarDemo3
{
	public static void main(String[] args)
	{
		//byte类型变量
		byte index1 = 20;
		System.out.println(index1);
		//short类型变量
		short index2 = 18;
		System.out.println(index2);
		//char类型变量
		char index3 = 20;
		System.out.println(index3);
		//int类型变量
		int index4 = 20;
		System.out.println(index4);
		//long类型变量
		long index5 = 20L;
		System.out.println(index5);
		//float类型变量
		float index6 = 3.14F;
		System.out.println(index6);
		//double类型变量
		double index7 = 3.14;
		System.out.println(index7);
		//boolean类型变量
		boolean index8 = true;
		System.out.println(index8);
		
		//String类型变量
		String index9 = "123";
		System.out.println(index9);
	}
}