package cn.onedull.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring.service.impl.EmployeeServiceProxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {
	
	@Autowired
	private IEmployeeService proxy;
//	private EmployeeServiceProxy proxy;
	
	@Test
	public void testSave() throws Exception {
		proxy.save("q", "123");
	}
}
