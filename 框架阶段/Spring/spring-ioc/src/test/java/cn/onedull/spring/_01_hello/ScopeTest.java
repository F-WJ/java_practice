package cn.onedull.spring._01_hello;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring._02_ioc.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ScopeTest {
	@Autowired
	private Person person1;
	
	@Autowired
	private Person person2;
	
	@Test
	public void testScope() {
		System.out.println(person1);
		System.out.println(person2);
	}

}
