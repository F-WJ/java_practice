package cn.onedull.pmis.dao;

import java.util.List;

import cn.onedull.pmis.domain.Product;

public interface IProductDAO {
	//添加数据
	void save(Product product);
	//删除数据
	void delete(Long id);
	//修改数据
	void update(Product product);
	//查
	Product get(Long id);
	List<Product> getAll();
	
}
