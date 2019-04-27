package test06;
/**
 * 
 * @author FWJ
 *
 */
public class Demo {

	public static void main(String[] args) {
		int i = 0;
		for(print('a'); print('b') && (i < 2); print('c')) {
			i++;
			print('d');
		}
	}
	
	private static boolean print(char c) {
		System.out.println(c);
		return true;
	}

}

/*
答案与解析

1.相关知识for循环括号中的内容分别为初始化、布尔表达式、更新
初始化：对循环可能要用到的值进行初始化，相当于for循环内部的一个局部变量
布尔表达式：当表达式结果为true时继续执行，为false时终止循环
更新：在一次循环结束后进行更新，一般用于修改初始化值，从而影响循环布尔表达式的

2.源码分析
main函数，定义了整型变量i赋初始值0
for循环，初始化调用了方法print传递参数'a'；布尔表达式调用了方法print传递了参数'b'与i<2做与操作；更新调用了方法print，传递参数'c'。
i自增
调用方法print，传递参数'd'。
定义print方法返回boolean，传递参数字符型
输出传进来的字符参数c
返回真。

3.答案解析
首先for循环初始化，打印a。(结果a)
进行表达式判断，打印b，返回true，i=0<2同样返回true。(结果ab)
i自增，i=1。
打印d(结果abd)
更新，打印c。(结果abdc)
再次循环进行表达式判断，不用进行初始化，打印b，i=1<2返回true(结果abdcb)
i自增，i=2.
打印d。(结果abdcbd)
更新，打印c。(结果abdcbdc)
表达是判断，打印b,i=2<2返回false,终止循环(结果abdcbdcb)
答案abdcbdcb
*/

