package cn.onedull.spring.service;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring.handler.TransactionHandler;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {
	
	@Autowired
	private TransactionHandler handler;
	
	@Test
	public void testSave() throws Exception {
		//新建一个enhance对象
		Enhancer enhancer = new Enhancer();
		//插入真实类
		enhancer.setSuperclass(handler.getTarget().getClass());
		//插入代理对象
		enhancer.setCallback(handler);
		//创建代理对象
		IEmployeeService proxy = (IEmployeeService)enhancer.create();
		//调用方法
		proxy.save("q", "123");
	}
}
