package cn.onedull.umis.dao;

import java.util.List;

import cn.onedull.umis.domain.User;
import cn.onedull.umis.query.UserQueryObject;

public interface IUserDAO {
	//保存
	void save(User user);
	//删除
	void delete(Long id);
	//修改
	void update(User user);
	//得到数据
	User get(Long id);
	//按照条件查询数据
	List<User> QueryForList(UserQueryObject qo);
	//获取总条数
	int QueryForCount(UserQueryObject qo);
	
}
