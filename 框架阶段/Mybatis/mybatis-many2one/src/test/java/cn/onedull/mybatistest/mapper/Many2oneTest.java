package cn.onedull.mybatistest.mapper;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.onedull.mybatistest.domain.Department;
import cn.onedull.mybatistest.domain.Employee;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class Many2oneTest {

	@Test
	public void testMany2One() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类
		DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		//调用保存部门方法
		Department dept = new Department(null, "测试部");
		departmentMapper.save(dept);
		
		//调用保存员工信息
		Employee employee = new Employee(null, "小天", dept);
		employeeMapper.save(employee);
		
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
		
		Employee employee = employeeMapper.get(4L);
		System.out.println(employee);
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
