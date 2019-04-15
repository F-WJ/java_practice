/*
需求：演示静态代码块、初始化代码块、局部代码块的写法

步骤:
(1)创建一个Test类, 创建一个static代码块, 初始化代码块, 局部代码块
(2)创建测试类TestDemo, 创建对象, 调用say方法, 观察打印结果

总结:
(1)静态代码块: 当该类的字节码文件加载到JVM, 就执行static代码块
(2)初始化代码块: 创建对象的时候, 会执行这段代码
(3)局部代码块: 定义在方法里面的代码块. 调用方法的时候, 就会执行
*/

package cn.onedull.codeblock_demo;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("主方法");
		//创建对象
		Test test = new Test();
		test.say();
	}

}
