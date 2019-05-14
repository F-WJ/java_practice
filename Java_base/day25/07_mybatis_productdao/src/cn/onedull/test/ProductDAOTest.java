package cn.onedull.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import cn.onedull.dao.IProductDAO;
import cn.onedull.dao.impl.ProductDAOImpl;
import cn.onedull.domain.Product;
/**
 * 
 * 总结：
 * 注意创建数据库， 属性的名字空格的问题
 * 
 * 
 * @author FWJ
 *
 */
public class ProductDAOTest {
	private IProductDAO ipr = new ProductDAOImpl();
	@Test
	public void testSave() {
		Product product = new Product(null, "鼠标", new BigDecimal("200"), new BigDecimal("0.7")); 
		ipr.save(product);
	}

	@Test
	public void testDelete() {
		ipr.delete(2L);
	}

	@Test
	public void testUpdate() {
		Product product = new Product(1L, "鼠标", new BigDecimal("200"), new BigDecimal("0.7"));
		ipr.update(product);
	}

	@Test
	public void testGet() {
		ipr.get(2L);
	}

	@Test
	public void testGetAll() {
		ipr.getAll();
	}

}
