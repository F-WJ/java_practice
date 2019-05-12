package cn.onedull._02_key;

import java.sql.Connection;

import org.junit.Test;

public class ReturnKeysTest {
	@Test
	public void testDBCP() throws Exception {
		Connection connection = DBCPUtil.connection();
	}	
	
	@Test
	public void testDruid() throws Exception {
		Connection connection = DruidUtil.connection();
	}
}
