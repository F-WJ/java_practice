package test.test2;

public class ExceptionTest {

	public static void main(String[] args) {
		int number = 0;
	
		System.out.println(returnTest(number));

	}
	
	
	
	private static int returnTest(int number) {
		try {
			System.out.println("try: " + number);
			return number++;
		}catch(Exception ignored) {
			
		}finally {
			System.out.println("finally: " + number);
			return ++number;
		}
		
	}

}

/*
答案与解析

1.相关知识我们之前都练习都见到过try catch finally，
也知道了无论是否捕获到异常都会执行finally语句，那么当try和finally同时return时，
会是什么样的顺序呢。
当try中有return，存在finally时，会先执行return之后的语句但不返回，
执行完finally中的语句再return，如果finally语句中也有return，
会直接通过finally的return语句返回。

2.源码分析
定义了一个整型变量number赋初始值为0
returnTest方法传入参数number，将方法的返回值输出
returnTest方法try方法体中返回number++
catch中什么也不做
finally中返回 ++number。

3.答案解析
执行try时先将number变为1，之后finally中number变为2，最终返回2
因此输出2
*/
