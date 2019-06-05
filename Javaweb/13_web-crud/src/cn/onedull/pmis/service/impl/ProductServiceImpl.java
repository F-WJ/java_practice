package cn.onedull.pmis.service.impl;

import java.util.List;

import cn.onedull.pmis.dao.IProductDAO;
import cn.onedull.pmis.dao.impl.ProductDAOImpl;
import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.service.IProductService;

public class ProductServiceImpl implements IProductService{
	IProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void save(Product product) {
		dao.save(product);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public void update(Product product) {
		dao.update(product);
		
	}

	@Override
	public Product get(Long id) {
		Product product = dao.get(id);
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> list = dao.getAll();
		return list;
	}

}
