package cn.onedull.spring._01_hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring._03_di.CollectionBean;
import cn.onedull.spring._03_di.Employee;
import cn.onedull.spring._03_di.EmployeeDAO;
import cn.onedull.spring._03_di.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DiTest {
	
	@Autowired
	private Employee employee;
	
	@Autowired
	private EmployeeDAO dao;
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private CollectionBean cb;
	
	@Test
	public void testEmployee() throws Exception {
		System.out.println(employee);
		
	}
	
	@Test
	public void testEmployeeDAO() throws Exception {
		System.out.println(dao);
		service.save();
		System.out.println(service.getDao());
		
	}
	
	@Test
	public void testEmployeeCollection() throws Exception {
		System.out.println(cb);
		
		
	}
}
