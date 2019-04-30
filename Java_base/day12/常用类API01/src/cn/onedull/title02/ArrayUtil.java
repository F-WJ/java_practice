package cn.onedull.title02;

public class ArrayUtil {
	//私有化构造器
	private ArrayUtil() {
		
	}
	//创建一个私有静态的对象
	private static ArrayUtil arrayutil = new ArrayUtil();
	
	//创建一个公共静态的get方法
	public static ArrayUtil getUtil() {
		return arrayutil;
	}
	
	
	//创建一个方法 
	public String toString(int[] arr) {
		String str = java.util.Arrays.toString(arr);
		return str;
	}
	
	
}
