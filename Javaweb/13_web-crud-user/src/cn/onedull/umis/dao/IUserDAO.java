package cn.onedull.umis.dao;

import java.util.List;

import cn.onedull.umis.domain.User;

public interface IUserDAO {
	void save(User user);
	void delete(Long id);
	void update(User user);
	User get(Long id);
	List<User> getAll();
}
