package cn.onedull.dao;

import java.util.List;

import cn.onedull.domain.User;

public interface IUserDAO {
	void save(User user);
	void delete(Long id);
	void update(User user);
	User get(Long id);
	List<User> getAll();
}
