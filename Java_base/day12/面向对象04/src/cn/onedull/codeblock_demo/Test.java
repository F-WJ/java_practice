package cn.onedull.codeblock_demo;

public class Test {
	
	{
		System.out.println("初始化代码块");
	}
	
	public Test() {
		System.out.println("构造器");
	}
	
	static {
		System.out.println("静态代码块");
	}
	
	void say() {
		System.out.println("局部代码块");
	}
}
