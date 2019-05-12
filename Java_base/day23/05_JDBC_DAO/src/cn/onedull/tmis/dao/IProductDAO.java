package cn.onedull.tmis.dao;

import java.util.List;

import cn.onedull.tmis.domain.Product;

public interface IProductDAO {
	//保存
	void save(Product product);
	//删
	void delete(Long id);
	//改
	void update(Product pro);
	//查
	List<Product> get(Long id);
}
