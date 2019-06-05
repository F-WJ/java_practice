package cn.onedull.pmis.dao;

import java.util.List;

import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.query.ProductQueryObject;


public interface IProductDAO {

	//查满足条件的当前页数据
	List<Product> queryForList(ProductQueryObject qo);
	
	//查询总数据
	int queryForCount(ProductQueryObject qo);
	
}
