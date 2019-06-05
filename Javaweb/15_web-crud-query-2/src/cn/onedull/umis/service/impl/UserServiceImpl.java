package cn.onedull.umis.service.impl;

import java.util.List;


import cn.onedull.umis.dao.IUserDAO;
import cn.onedull.umis.dao.impl.UserDAOImpl;
import cn.onedull.umis.domain.User;
import cn.onedull.umis.query.UserQueryObject;
import cn.onedull.umis.result.PageResult;
import cn.onedull.umis.service.IUserService;
import javafx.print.PageRange;

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
	public PageResult query(UserQueryObject qo) {
		//导入DAO层
		//创建结果
		PageResult pageResult;
		//获取总数据
		System.out.println(qo.getMinSalary() + " : " + qo.getMaxSalary());
		int totalCount = dao.QueryForCount(qo);
		if(totalCount == 0){
			pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize());		
		}else{
			List<User> listData = dao.QueryForList(qo);
			pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize(), listData, totalCount);
		}
		return pageResult;
	}

}
