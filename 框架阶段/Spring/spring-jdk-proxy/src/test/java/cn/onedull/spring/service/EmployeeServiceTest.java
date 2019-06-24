package cn.onedull.spring.service;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
		IEmployeeService proxy = (IEmployeeService)Proxy.newProxyInstance(handler.getClass().getClassLoader(), 
				handler.getTarget().getClass().getInterfaces(), handler);
		proxy.save("q", "123");
	}
}
