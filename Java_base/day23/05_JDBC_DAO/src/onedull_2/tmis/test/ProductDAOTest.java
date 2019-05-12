package onedull_2.tmis.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import onedull_2.tmis.dao.IProductDAO;
import onedull_2.tmis.dao.impl.ProductDAOImpl;
import onedull_2.tmis.domain.Product;


public class ProductDAOTest {
	private IProductDAO pd = new ProductDAOImpl();
	@Test
	public void testSave() {
		Product product = new Product(null, "mate30", 8400.08, 0.6);
		pd.save(product);
	}

	@Test
	public void testDelete() {
		pd.delete(3L);
	}

	@Test
	public void testUpdate() {
		Product product = new Product(null, "matepro30", 10400.08, 0.6);
		pd.update(product);
	}

	@Test
	public void testGet() {
		Product product = new Product();
		List<Product> list = pd.get(product, null);
		System.out.println(list);
	}

}
