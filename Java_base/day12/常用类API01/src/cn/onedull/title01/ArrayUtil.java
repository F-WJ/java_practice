package cn.onedull.title01;

public class ArrayUtil {
	//私有化构造器
	private ArrayUtil() {
		
	}
	
	//静态方法
	public static String toString(int[] arr) {
		String str = java.util.Arrays.toString(arr);
		return str;
	}
}
