package cn.onedull.dao;

import java.util.List;

import cn.onedull.domain.Employee;

public interface IEmployeeDAO {
	//保存
	void save(Employee employee);
	//删除
	void delete(Long id);
	//修改
	void update(Employee employee);
	//查单条
	Employee get(Long id); 
	//查多条
	List<Employee> getAll();
}
