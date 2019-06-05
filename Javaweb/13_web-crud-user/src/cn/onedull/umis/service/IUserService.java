package cn.onedull.umis.service;

import java.util.List;

import cn.onedull.umis.domain.User;

public interface IUserService {
	void save(User user);
	void delete(Long id);
	void update(User user);
	User get(Long id);
	List<User> getAll();
}
