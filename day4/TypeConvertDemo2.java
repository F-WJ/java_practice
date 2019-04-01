/*
需求: 演示强制类型转换
步骤:
(1)定义一个int类型变量a
(2)定义一个byte类型变量b
(3)定义一个变量接收a加b的和
(4)把double类型的常量转换为int类型

总结:
(1)不建议使用强转,可能会损失精度(例如double转int)
*/

public class TypeConvertDemo2
{
	public static void main(String[] args)
	{
		//定义int和byte类型变量,并赋值
		int a = 1;
		byte b = 2;
		int demo = a + b;
		int c = (int)3.14;
		System.out.println(c);

	}
}