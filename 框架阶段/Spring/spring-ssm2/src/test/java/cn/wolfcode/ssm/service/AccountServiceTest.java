package cn.wolfcode.ssm.service;


import java.math.BigDecimal;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wolfcode.ssm.mapper.AccountMapper;
import cn.wolfcode.ssm.service.impl.AccountServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceTest {

	@Autowired
	private IAccountService accountService;
	
	//测试dataSource
	@Autowired
	private DataSource dataSource;
	
	
	@Test
	public void testDataSource() throws Exception {
		System.out.println(dataSource);
	}
	
	@Test
	public void testaccountService() throws Exception {
		accountService.transfer(2L, 1L, new BigDecimal("1000"));
	}

}
