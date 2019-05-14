package cn.onedull.dao;

import cn.onedull.domain.Product;

public interface IProductDAO {
	//保存
	void save(Product product);
	//删除
	void delete(Long id);
	//修改
	void update(Product product);
	//查单条
	void get(Long id);
	//查多条
	void getAll();
	
}
