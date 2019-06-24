package cn.onedull.pmis.service.impl;

import java.util.List;

import cn.onedull.pmis.dao.IProductDAO;
import cn.onedull.pmis.dao.impl.ProductDAOImpl;
import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.result.PageResult;
import cn.onedull.pmis.service.IProductService;

public class ProductServiceImpl implements IProductService{
	//获取sql两个数据
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
	public PageResult query(ProductQueryObject qo) {
		PageResult pageResult;
		//获取总数据
		int totalCount = dao.queryForCount(qo);
		System.out.println(qo.getMinSalePrice() + " : " + qo.getMaxSalePrice());
		//判断是否数据
		if(totalCount == 0){
			pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize());
		}else{
			//获取得当前页的所有数据
			System.out.println(qo);
			List<Product> listDate = dao.queryForList(qo);
			pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize(), listDate, totalCount);
		}
		return pageResult;
		
		
	}
	
}
