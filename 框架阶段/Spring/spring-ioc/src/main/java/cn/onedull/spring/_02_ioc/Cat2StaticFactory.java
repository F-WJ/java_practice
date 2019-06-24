package cn.onedull.spring._02_ioc;

public class Cat2StaticFactory {
	public static Cat2 getInstance(){
		Cat2 cat2 = new Cat2();
		return cat2;
	}
}
