package onedull_2.tmis.dao;

import java.util.List;

import onedull_2.tmis.domain.Product;



public interface IProductDAO {
	//保存
	void save(Product product);
	//删
	void delete(Long id);
	//改
	void update(Product product);
	//查
	List<Product> get(Product product, Long id);
}
