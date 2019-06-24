package cn.onedull.spring._01_hello;


import java.lang.annotation.Target;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring._02_ioc.Cat1;
import cn.onedull.spring._02_ioc.Cat4;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class IoCTest {
	
	@Autowired
	private Cat1 cat1;
	
	@Autowired
	private Cat4 cat4;
	
	@Test
	public void testCat1() throws Exception {
		
	}
	
	@Test
	public void testCat2() throws Exception {

	}
	
	@Test
	public void testCat3() throws Exception {

	}
	
}
