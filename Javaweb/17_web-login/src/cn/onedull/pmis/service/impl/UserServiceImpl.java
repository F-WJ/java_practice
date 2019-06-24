package cn.onedull.pmis.service.impl;

import cn.onedull.pmis.dao.IUserDAO;
import cn.onedull.pmis.dao.impl.UserDAOImpl;
import cn.onedull.pmis.domain.User;
import cn.onedull.pmis.service.IUserService;

public class UserServiceImpl implements IUserService {
	IUserDAO dao = new UserDAOImpl();
	
	@Override
	public User login(User user) {
		//检查用户是否存在数据库中
		User u = dao.checkUserName(user.getName());
		if(u == null){
			//错误
			throw new RuntimeException("此账号名不存在");
		}
		
		//判断密码是否相同
		if(!u.getPassword().equals(user.getPassword())){
			throw new RuntimeException("密码不对");
		}
		return u;
	}

}
