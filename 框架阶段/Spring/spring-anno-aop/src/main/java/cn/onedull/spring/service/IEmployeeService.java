package cn.onedull.spring.service;

public interface IEmployeeService {
	//业务操作save 用户和密码
	void save(String name, String password);
	//修改操作update
	void update(String name, String password);
}
