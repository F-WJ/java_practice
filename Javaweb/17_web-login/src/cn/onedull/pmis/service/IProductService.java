package cn.onedull.pmis.service;


import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.query.QueryObject;
import cn.onedull.pmis.result.PageResult;

public interface IProductService {
	PageResult query(ProductQueryObject qo);
}
