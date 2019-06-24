package cn.onedull.mybatistest.mapper;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.onedull.mybatistest.domain.Department;
import cn.onedull.mybatistest.domain.Employee;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class Many2oneTest {

	@Test
	public void testSave() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类
		DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		//调用保存部门方法（部门名字）
		Department dept = new Department();
		dept.setName("销售部");
		departmentMapper.save(dept);
		
		
		//调用保存员工信息(部门id)
		Employee employee = new Employee(null, "小乔", dept.getId());
		Employee employee2 = new Employee(null, "da乔", dept.getId());
		employeeMapper.save(employee);
		employeeMapper.save(employee2);
		
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testGet() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类
		DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		Department dept = departmentMapper.get(25L);
		System.out.println(dept);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	@Test
	public void testGetAll() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类
		DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		List<Employee> employee = employeeMapper.getAll();
		System.out.println(employee);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
}
