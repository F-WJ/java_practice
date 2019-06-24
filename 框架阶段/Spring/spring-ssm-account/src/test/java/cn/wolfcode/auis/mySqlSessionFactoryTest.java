package cn.wolfcode.auis;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wolfcode.auis.servlet.AccountServlet;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class mySqlSessionFactoryTest {

	@Autowired
	private AccountServlet accountServlet;
	
	@Test
	public void testAccountServlet() {
		accountServlet.transfer(1L, 2L, new BigDecimal("1000"));
		
	}

}
