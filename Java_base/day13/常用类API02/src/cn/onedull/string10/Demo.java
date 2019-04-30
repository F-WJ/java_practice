/*
编写一个方法:
	传入一个  int 值 , 返回该值的位数
		例如  123   返回 3 位数
		      1     返回 1 位数
		      10    返回 2 位数
		      
思路: 把int类型装箱后, 使用String方法转换String类型, 然后通过String类的length()来统计数

*/
package cn.onedull.string10;

public class Demo {

	public static void main(String[] args) {
		int a = 123;
		//调用方法
		int size = Demo.getNum(a);
		System.out.println(size);
	}
	
	static int getNum(int a) {
		Integer num = Integer.valueOf(a);
		String str = num.toString();
		int size = str.length();
		
		return size;
	}

}
