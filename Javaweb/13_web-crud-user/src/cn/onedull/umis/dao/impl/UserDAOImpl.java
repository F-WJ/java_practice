package cn.onedull.umis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.umis.dao.IUserDAO;
import cn.onedull.umis.domain.User;
import cn.onedull.umis.util.MybatisUtil;

public class UserDAOImpl implements IUserDAO {

	@Override
	public void save(User user) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.umis.mapper.UserMapper.save", user);
		session.commit();
		session.close();

	}

	@Override
	public void delete(Long id) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.umis.mapper.UserMapper.delete", id);
		session.commit();
		session.close();

	}

	@Override
	public void update(User user) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.umis.mapper.UserMapper.update", user);
		session.commit();
		session.close();

	}

	@Override
	public User get(Long id) {
		SqlSession session = MybatisUtil.getSession();
		User user = session.selectOne("cn.onedull.umis.mapper.UserMapper.get", id);
		session.commit();
		session.close();
		return user;
	}

	@Override
	public List<User> getAll() {
		SqlSession session = MybatisUtil.getSession();
		List<User> list = session.selectList("cn.onedull.umis.mapper.UserMapper.getall");
		session.commit();
		session.close();
		return list;
	}

}
