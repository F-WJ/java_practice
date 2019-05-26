package cn.onedull.practice._03;

/**
答案与解析

1.相关知识返回值中++在前时，会先+1再返回
返回值中++在后时，会先返回再+1
静态变量为所有对象共享
2.答案解析
因为count为静态变量，因此所有对象访问的都为同一个变量
首先count对象调用add方法，++在后，输出0，值为1
调用add2方法，++在前，先+1，输出2，值为2
调用count2的add方法，++在后，输出2，值变为3
输出结果为 0 2 2
 */
public class test {
	public static void main(String[] args) {
		Count count = new Count();
		System.out.println(count.add() + " ");
		System.out.println(count.add2() + " ");
		Count count2 = new Count();
		System.out.println(count2.add());
	}
	
	
}


class Count{
	private static int count = 0;
	
	public int add(){
		return count++;
	}
	
	int add2(){
		return ++count;
	}
}
