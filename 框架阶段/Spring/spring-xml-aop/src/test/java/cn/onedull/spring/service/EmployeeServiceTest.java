package cn.onedull.spring.service;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {
	
	@Autowired
	private IEmployeeService em;
	
	@Test
	public void testSave() throws Exception {
		//查看对象地址
		System.out.println(em.getClass());
		//调用方法
		em.save("q", "123");
	
	}
}
