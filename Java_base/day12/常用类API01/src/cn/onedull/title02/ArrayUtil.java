package cn.onedull.title02;

public class ArrayUtil {
	//˽�л�������
	private ArrayUtil() {
		
	}
	//����һ��˽�о�̬�Ķ���
	private static ArrayUtil arrayutil = new ArrayUtil();
	
	//����һ��������̬��get����
	public static ArrayUtil getUtil() {
		return arrayutil;
	}
	
	
	//����һ������ 
	public String toString(int[] arr) {
		String str = java.util.Arrays.toString(arr);
		return str;
	}
	
	
}
