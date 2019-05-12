package cn.onedull.umis.dao;

import java.util.List;

import cn.onedull.umis.domain.User;



public  interface IUserDAO {
	//添加数据
	void save(User user);
	//删除数据
	void delete(Long id);
	//修改数据
	void update(User user);
	//获取数据
	List<User> get();
}
