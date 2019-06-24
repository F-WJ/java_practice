package cn.onedull.mybatistest.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.onedull.mybatistest.domain.LoginInfo;

public interface LoginInfoMapper {
	//查询
	//List<LoginInfo> get(LoginInfo loginInfo);
	//使用注解设置属性名
	List<LoginInfo> get(@Param("username")String username, @Param("password")String password);
	
}
