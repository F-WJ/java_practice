/*
需求:演示逻辑运算符
步骤:
(1)与操作
(2)或操作
(3)取反操作
(4)证明&和&&的区别
(5)证明|和||的区别

总结:
(1) &和&&的区别在于&左边无论真假,右边表达式都一定会运行运算. 
	而&&右边表达式为真,右边表达式参与运行,否则右边表达式不参与运行
	|和||同理
*/
public class LogicalOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(false && 1/0==1);  //false
		System.out.println(true || 1/0==1);   //true
		System.out.println("hello" + 7 + 8);  //hello78
	}
}