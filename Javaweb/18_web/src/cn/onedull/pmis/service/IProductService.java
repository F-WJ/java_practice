package cn.onedull.pmis.service;



import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.result.PageResult;

public interface IProductService {
	//添加数据
	void save(Product product);
	//删除数据
	void delete(Long id);
	//修改数据
	void update(Product product);
	//查数据
	Product get(Long id);
	//获取7个数据
	PageResult query(ProductQueryObject qo);
}
