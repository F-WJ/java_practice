/*
需求:定义一个int类型的变量,并赋值
步骤:
(1)方式1:先定义后赋值
(2)方式2:定义变量并同时赋值,打印变量

总结: 变量必须先声明
*/
public class VarDemo2
{
	public static void main(String[] args)
	{
		//先定义后赋值
		int index;
		index = 1;
		System.out.println(index);
		//定义变量的同时赋值
		int index2 = 2;
		System.out.println(index2);

	}
}