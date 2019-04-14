package test3;

public class Value {
	public static void main(String[] args) {
		System.out.println(getValue(2));
	}

	private static int getValue(int i) {
		int result = 0;
		switch(i) {
			case 1 : result += 1;
			case 2 : result += i*2;
			case 3 : result += i*3;
		}
		return result;  //10
	}
}


/*
 * 答案与解析
 * 
 * 1.相关知识
 * switch语句会根据switch语句中的变量值，从变量值与case语句的相等值位置的case语句之后开始执行，
 * 直到break语句出现才会跳出switch语句。
 * 当遇到break语句是，switch语句终止。程序跳转到switch语句后面你的语句执行。case语句不必须要包含break语句。
 * 如果没有break语句出现，程序会继续执行下一条case语句，直到出现break语句。 
 * 
 * 2.源码分析
 * 给getValue方法传递了参数值2，输出方法的返回值 getValue方法的定义，定义了一个整型result变量，初始值为0
 * switch语句，将传入的参数值作为switch参数 case1将result加上传入的参数值 case2将result加上传入的参数值乘以2
 * case3将result加上传入的参数值乘以3 返回result值 
 * 
 * 3.答案解析 
 * 传入2，从case2开始执行，result=0+2*2=4
 * 没有break继续执行case3，result=4+2*3=10 因此返回值为10，输出10
 */