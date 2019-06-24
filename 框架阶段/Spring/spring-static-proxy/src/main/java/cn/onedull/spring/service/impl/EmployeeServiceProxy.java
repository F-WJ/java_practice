package cn.onedull.spring.service.impl;

import cn.onedull.spring.service.IEmployeeService;
import cn.onedull.spring.tx.TransactionManager;

//代理(中间人)
public class EmployeeServiceProxy implements IEmployeeService{
	private IEmployeeService target;
	private TransactionManager transactionManager;

	public void setTransactionManager(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void setTarget(IEmployeeService target) {
		this.target = target;
	}
	
	public void save(String name, String password){
		try {
			transactionManager.begin();
			target.save(name, password);
		} catch (Exception e) {
			transactionManager.rollback();
			e.printStackTrace();
		}
		transactionManager.commit();
	}

	@Override
	public void update(String name, String password) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
