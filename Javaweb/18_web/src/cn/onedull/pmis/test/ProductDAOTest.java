package cn.onedull.pmis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.onedull.pmis.dao.IProductDAO;
import cn.onedull.pmis.dao.impl.ProductDAOImpl;
import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.query.QueryObject;

public class ProductDAOTest {
	IProductDAO dao = new ProductDAOImpl(); 
	
	@Test
	public void testQueryForList() {
		ProductQueryObject qo = new ProductQueryObject();
		List<Product> queryForList = dao.queryForList(qo);
		System.out.println(queryForList.size());
	}

	@Test
	public void testQueryForCount() {
		ProductQueryObject qo = new ProductQueryObject();
		int queryForCount = dao.queryForCount(qo);
		System.out.println(queryForCount);
		
	
	}
	
	@Test
	public void testq() throws Exception {
		//总页数（总数据 每页总数）
		
		//上一页（当前页 -1）
		
		//下一页（当前页 +1）
	}

}
