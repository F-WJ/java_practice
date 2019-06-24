package cn.onedull.spring.tx;

public class TransactionManager {
	//事务
	//开启事务
	public void begin(){
		System.out.println("开启事务");
	}
	
	//提交事务
	public void commit(){
		System.out.println("提交事务");
	}
	
	//回滚事务
	public void rollback(Throwable tw){
		System.out.println("回滚事务" + tw);
	}


}
