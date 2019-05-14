package cn.onedull.dao.impl;

import java.math.BigDecimal;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.dao.IProductDAO;
import cn.onedull.domain.Product;
import cn.onedull.util.MybatisUtil;


public class ProductDAOImpl implements IProductDAO{

	@Override
	public void save(Product product) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.ProductMapper.save", product);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Override
	public void delete(Long id) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.ProductMapper.delete", id);
		//提交
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public void update(Product product) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.ProductMapper.update", product);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Override
	public void get(Long id) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.ProductMapper.get", id);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Override
	public void getAll() {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.ProductMapper.getall");
		//提交
		session.commit();
		//释放资源
		session.close();
	}

}
