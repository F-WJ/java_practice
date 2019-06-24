package cn.onedull.spring.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import cn.onedull.spring.tx.TransactionManager;

public class TransactionHandler implements InvocationHandler{
	public Object getTarget() {
		return target;
	}



	//真实类
	private Object target;
	//事务
	private TransactionManager tm; 
	
	
	
	public void setTarget(Object target) {
		this.target = target;
	}



	public void setTm(TransactionManager tm) {
		this.tm = tm;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//开启事务
		tm.begin();
		Object invoke = null;
		try {
			invoke = method.invoke(target, args);
			//提交事务
			tm.commit();
		} catch (Exception e) {
			//回滚事务
			tm.rollback();
			e.printStackTrace();
		}
		return invoke;
	}

}
