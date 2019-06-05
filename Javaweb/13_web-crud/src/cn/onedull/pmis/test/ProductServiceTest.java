package cn.onedull.pmis.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.onedull.pmis.dao.IProductDAO;
import cn.onedull.pmis.dao.impl.ProductDAOImpl;

public class ProductServiceTest {
	IProductDAO dao = new ProductDAOImpl();
	
	@Test
	public void testSave() {
		
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAll() {
		dao.getAll();
	}

}
