package cn.onedull.mybatistest.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.onedull.mybatistest.domain.Employee;

public interface EmployeeMapper {
	//查询工资大于等于1000的员工
	List<Employee> queryByMinSalary(@Param("minSalary")BigDecimal minSalary);
	
	//查询工资大于等于1000并且小于等于1200的员工
	List<Employee> queryByMinSalaryToMaxSalary(@Param("minSalary")BigDecimal minSalary, @Param("maxSalary")BigDecimal maxSalary);
	
	//查询指定部门的员工（choose标签）
	List<Employee> queryByDept(@Param("deptId")Long deptId);
	
	//修改员工信息
	void update(Employee employee);
	
	//删除员工id是1,2,4的员工
	void delete(@Param("id")Long[] id);
	
	//批量插入
	void save(@Param("employee")List<Employee> employee);

}
