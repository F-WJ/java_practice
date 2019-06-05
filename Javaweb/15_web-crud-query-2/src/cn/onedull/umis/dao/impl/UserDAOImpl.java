package cn.onedull.umis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.umis.dao.IUserDAO;
import cn.onedull.umis.domain.User;
import cn.onedull.umis.query.UserQueryObject;
import cn.onedull.umis.util.mybatisUtil;

public class UserDAOImpl implements IUserDAO {
	//mapper模板
	private String mapperaddr = "cn.onedull.umis.mapper.UserMapper.";

	@Override
	public void save(User user) {
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		session.insert(mapperaddr + "save", user);
		//提交
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public void delete(Long id) {
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		session.insert(mapperaddr + "delete", id);
		//提交
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public void update(User user) {
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		session.insert(mapperaddr + "update", user);
		//提交
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public List<User> QueryForList(UserQueryObject qo) {
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		List<User> listData = session.selectList(mapperaddr + "queryForList", qo);
		//提交
		session.commit();
		//释放资源
		session.close();
		return listData;
	}

	@Override
	public int QueryForCount(UserQueryObject qo) {
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		int totalCount  = session.selectOne(mapperaddr + "queryForCount", qo);
		//提交
		session.commit();
		//释放资源
		session.close();
		return totalCount;
	}

	@Override
	public User get(Long id) {
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		User user = session.selectOne(mapperaddr + "get", id);
		//提交
		session.commit();
		//释放资源
		session.close();
		return user;
		
	}

}
