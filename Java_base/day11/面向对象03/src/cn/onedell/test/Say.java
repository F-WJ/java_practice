package cn.onedell.test;

public interface Say {
	public abstract void say();
	
	public default  void test() {
		System.out.println("ÆÕÍ¨·½·¨");
	}
}
