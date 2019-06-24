package cn.onedull.spring._02_ioc;

public class MyDataSource {
	//初始化
	public void initMethod(){
		System.out.println("init...");
	}
	
	//运行
	public void doWork(){
		System.out.println("doWork...");
	}
	
	//销毁
	public void destroyMethod(){
		System.out.println("destory...");
	}
}
