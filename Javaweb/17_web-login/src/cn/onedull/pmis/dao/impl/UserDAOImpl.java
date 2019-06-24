package cn.onedull.pmis.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.pmis.dao.IUserDAO;
import cn.onedull.pmis.domain.User;
import cn.onedull.pmis.util.MybatisUtil;



public class UserDAOImpl implements IUserDAO {

	@Override
	public void save(User user) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.pmis.mapper.UserMapper.save", user);
		session.commit();
		session.close();

	}

	@Override
	public User checkUserName(String name) {
		SqlSession session = MybatisUtil.getSession();
		User user = session.selectOne("cn.onedull.pmis.mapper.UserMapper.get", name);
		session.close();
		return user;
	}

}
