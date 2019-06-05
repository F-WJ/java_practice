package cn.onedull.umis.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.umis.dao.IUserDAO;
import cn.onedull.umis.dao.impl.UserDAOImpl;
import cn.onedull.umis.domain.User;
import cn.onedull.umis.service.IUserService;
import cn.onedull.umis.util.MybatisUtil;

public class UserServiceImpl implements IUserService {
	IUserDAO dao = new UserDAOImpl();
		
	@Override
	public void save(User user) {
		dao.save(user);

	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public void update(User user) {
		dao.update(user);

	}

	@Override
	public User get(Long id) {
		User user = dao.get(id);
		return user;
	}

	@Override
	public List<User> getAll() {
		List<User> list = dao.getAll();
		return list;
	}

}
