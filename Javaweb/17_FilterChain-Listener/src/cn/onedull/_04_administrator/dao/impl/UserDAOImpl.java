package cn.onedull._04_administrator.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.onedull._04_administrator.dao.IUserDAO;
import cn.onedull._04_administrator.domain.User;
import cn.onedull._04_administrator.util.MybatisUtil;

public class UserDAOImpl implements IUserDAO {

	@Override
	public void save(User user) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull._04_administrator.mapper.UserMapper.save", user);
		session.commit();
		session.close();

	}

	@Override
	public User checkUserName(String name) {
		SqlSession session = MybatisUtil.getSession();
		User user = session.selectOne("cn.onedull._04_administrator.mapper.UserMapper.get", name);
		session.close();
		return user;
	}

}
