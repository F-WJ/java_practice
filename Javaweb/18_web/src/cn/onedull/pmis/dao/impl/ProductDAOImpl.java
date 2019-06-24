package cn.onedull.pmis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.pmis.dao.IProductDAO;
import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.util.MybatisUtil;

public class ProductDAOImpl implements IProductDAO {
	@Override
	public void save(Product product) {
		//获取session
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.pmis.mapper.Productmapper.save", product);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Override
	public void delete(Long id) {
		//获取session
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.delete("cn.onedull.pmis.mapper.Productmapper.delete", id);
		//提交
		session.commit();
		//释放资源
		session.close();
		
	}

	@Override
	public void update(Product product) {
		//获取session
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.update("cn.onedull.pmis.mapper.Productmapper.update", product);
		//同步
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public Product get(Long id) {
		//获取session
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		Product product = session.selectOne("cn.onedull.pmis.mapper.Productmapper.get", id);
		//提交
		session.commit();
		//释放资源
		session.close();
		return product;
	}

	
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
		int selectOne = session.selectOne("cn.onedull.pmis.mapper.Productmapper.queryForCount", qo);
		return selectOne;
	}





}
