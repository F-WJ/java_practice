package cn.onedull.mybatistest.mapper;


import java.util.List;

import cn.onedull.mybatistest.domain.User;

public interface UserMapper {
	//添加
	void save(User user);
	//
	void update(User user);
	//
	void delete(Long id);
	//
	List<User> get(Long id);
	
}
