package cn.onedull.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.dao.IUserDAO;
import cn.onedull.domain.User;
import cn.onedull.util.MybatisUtil;

public class IUserDAOImpl implements IUserDAO{

	@Override
	public void save(User user) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mappper.UserMappter.save", user);
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
		session.insert("cn.onedull.mappper.UserMappter.delaete", id);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Override
	public void update(User user) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mappper.UserMappter.update", user);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Override
	public User get(Long id) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		User user = session.selectOne("cn.onedull.mappper.UserMappter.get", id);
		//释放资源
		session.close();
		return user;
	}

	@Override
	public List<User> getAll() {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		List<User> list = session.selectList("cn.onedull.mappper.UserMappter.getall");
		//释放资源
		session.close();
		return list;
	}
	
}
