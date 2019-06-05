package cn.onedull.umis.service;

import java.util.List;


import cn.onedull.umis.domain.User;
import cn.onedull.umis.query.UserQueryObject;
import cn.onedull.umis.result.PageResult;

public interface IUserService {
	//保存
	void save(User user);
	//删除
	void delete(Long id);
	//修改
	void update(User user);
	//得到数据
	User get(Long id);
	//分页操作
	PageResult query(UserQueryObject qo);
	
}
