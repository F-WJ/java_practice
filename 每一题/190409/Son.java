package test1;

public class Son extends Father {
	public static void main(String[] args) {
		new Son().run();
	}

	private final void run() {
		System.out.println("son");
		
	}
}

//父类
class Father {
	private final void run() {
		System.out.println("father");
	}
}

/*
答案与解析
1.相关知识final修饰的方法不可以被重写，如果子类对final修饰的方法进行重写则编译报错。
private修饰的方法对于子类时不可见的，同样的方法名在父类和子类中同时出现表示的是新定义的方法，与父类无关。
子类父类存在相同方法时，子类进行调用时，优先调用子类的方法。

2.源码分析
定义了一个Son类继承于Father类
首先new了一个Son对象，并且调用了它的run()方法
定义了一个由一个private、final修饰的run方法，输出son
定义了Father类，同样有一个private、final修饰的run方法，输出father

3.答案解析
因为父类的run方法由private、final修饰因此与子类无关，如果去除private则子类run()编译错误，因此本身代码不存在问题。
将会直接调用子类的run方法输出son
 */
