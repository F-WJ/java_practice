package cn.onedull.tmis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.onedull.tmis.dao.IProductDAO;
import cn.onedull.tmis.dao.impl.ProductDAOImpl;
import cn.onedull.tmis.domain.Product;

public class ProductDAOTest {

	@Test
	public void testSave() {
		Product product = new Product(null, "mate30", 8400.08, 0.6);
		IProductDAO pd = new ProductDAOImpl();
		pd.save(product);
	}

	@Test
	public void testDelete() {
		IProductDAO pd = new ProductDAOImpl();
		pd.delete(3L);
	}

	@Test
	public void testUpdate() {
		IProductDAO pd = new ProductDAOImpl();
		Product product = new Product(null, "matepro30", 10400.08, 0.6);
		pd.update(product);
	}

	@Test
	public void testGet() {
		IProductDAO pd = new ProductDAOImpl();
		List<Product> list = pd.get(1L);
		System.out.println(list);
	}

}
