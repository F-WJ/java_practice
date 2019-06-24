package cn.onedull._04_administrator.dao;

import cn.onedull._04_administrator.domain.User;

public interface IUserDAO {
	//保存
	void save(User user);
	//检测用户是否存在
	User checkUserName(String name);
}
