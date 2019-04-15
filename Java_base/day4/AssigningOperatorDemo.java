/*
需求:演示赋值运算符
步骤:
(1)定义一个int类型变量age
(2)演示"+="符号,让age自身加10
(3)定义一个short类型变量s
(4)演示"+="符号,让s自身加2,并说明"+="符号的效果

总结:
(1)了解+=底层原理(自动强制转换变量的数据类型)
*/
public class AssigningOperatorDemo
{
	public static void main(String[] args)
	{
		//定义一个int类型变量
		int age = 18;
		System.out.println(age+=10);
		short s = 10;
		s+=2; // 等价于 s = (short)(s + 2);
		System.out.println(s);
	}
}