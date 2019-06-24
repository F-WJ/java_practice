package cn.onedull.mybatistest.mapper;

import cn.onedull.mybatistest.domain.Department;

public interface DepartmentMapper {
	//保存
	void save(Department dept);
	
	//查询
	Department get(Long id);
}
