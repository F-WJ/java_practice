package cn.onedull.mybatistest.mapper;



import java.util.List;

import cn.onedull.mybatistest.domain.Employee;


public interface EmployeeMapper {

	//保存
	void save(Employee meployee);
	
	//查询
	Employee get(Long id);
	
	//查询全部
	List<Employee> getAll();

}
