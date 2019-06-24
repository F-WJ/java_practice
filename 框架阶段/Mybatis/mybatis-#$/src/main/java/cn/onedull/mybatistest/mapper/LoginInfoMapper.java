package cn.onedull.mybatistest.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.onedull.mybatistest.domain.LoginInfo;

public interface LoginInfoMapper {
	//查询
	//List<LoginInfo> get(LoginInfo loginInfo);
	List<LoginInfo> get(@Param("username")String username, @Param("password")String password);
	
	//使用$
	List<LoginInfo> get2(@Param("username")String username);
	
	//orderby,使用$
	List<LoginInfo> get3(@Param("cloumnName")String cloumnName);
	
}
