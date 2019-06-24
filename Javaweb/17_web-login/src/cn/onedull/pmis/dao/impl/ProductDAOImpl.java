package cn.onedull.pmis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.pmis.dao.IProductDAO;
import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.query.QueryObject;
import cn.onedull.pmis.util.MybatisUtil;

public class ProductDAOImpl implements IProductDAO {

	@Override
	public List<Product> queryForList(ProductQueryObject qo) {
		// 每页数据
		SqlSession session = MybatisUtil.getSession();
		//执行数据
		List<Product> list = session.selectList("cn.onedull.pmis.mapper.Productmapper.queryForList", qo);
		return list;
	}

	@Override
	public int queryForCount(ProductQueryObject qo) {
		//总数据量
		SqlSession session = MybatisUtil.getSession();
		int selectOne = session.selectOne("cn.onedull.pmis.mapper.Productmapper.queryForCount");
		return selectOne;
	}





}
