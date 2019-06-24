package cn.onedull.spring.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;

import cn.onedull.spring.service.IEmployeeService;

//房东
public class EmployeeServiceimpl implements IEmployeeService {

	
	public void save(String name, String password) {
		//int i = 1/0;
		System.out.println("保存：" + name + "，" + password);
		
	}

	
	public void update(String name, String password) {
		System.out.println("修改：" + name + "，" + password);
		
	}
	

	//模拟保存和修改
	//开启，提交，回滚事务通过try模拟

}
