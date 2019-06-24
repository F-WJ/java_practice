package cn.onedull.spring._01_hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring._02_ioc.MyDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LifecycleTest {
	
	@Autowired
	private MyDataSource ms;
	
	@Test
	public void testLifecycle() throws Exception {
		ms.doWork();
	}
}
