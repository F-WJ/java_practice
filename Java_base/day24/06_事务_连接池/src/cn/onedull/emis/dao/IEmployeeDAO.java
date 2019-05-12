package cn.onedull.emis.dao;

import java.util.List;

import cn.onedull.emis.domain.Employee;


public interface IEmployeeDAO {
	//保存
	void save(Employee employee);
	//删
	void delete(Long id);
	//改
	void update(Employee employee);
	//查
	List<Employee> get(Employee employee, Long id);
	List<Employee> get(Employee employee);
	
	
}
