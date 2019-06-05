package cn.onedull.pmis.service;

import java.util.List;

import cn.onedull.pmis.domain.Product;

public interface IProductService {
	//添加数据
	void save(Product product);
	//删除数据
	void delete(Long id);
	//修改数据
	void update(Product product);
	//查数据
	Product get(Long id);
	List<Product> getAll();
}
