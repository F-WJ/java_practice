package cn.onedull.mybatistest.mapper;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.onedull.mybatistest.domain.Employee;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class EmployeeMapperTest {
	

	@Test
	public void testQueryByMinSalary() {
		SqlSession session = MyBatisUtil.getSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		List<Employee> queryByMinSalary = employeeMapper.queryByMinSalary(new BigDecimal("1000"));
		
		//释放资源
		session.close();
		System.out.println(queryByMinSalary);
	}
	
	@Test
	public void testQueryByMinSalaryToMaxSalary() {
		SqlSession session = MyBatisUtil.getSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		//List<Employee> queryByMinSalary = employeeMapper.queryByMinSalary(new BigDecimal("1000"));
		
		
		List<Employee> queryByMinSalaryToMaxSalary = employeeMapper.queryByMinSalaryToMaxSalary(new BigDecimal("1000"), new BigDecimal("1200"));
		
		//释放资源
		session.close();
		System.out.println(queryByMinSalaryToMaxSalary);
	}
	
	
	@Test
	public void testQueryByDept() {
		SqlSession session = MyBatisUtil.getSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		List<Employee> queryByDept = employeeMapper.queryByDept(null);
		
		//释放资源
		session.close();
		System.out.println(queryByDept);
	}
	
	
	@Test
	public void testUpdate() {
		SqlSession session = MyBatisUtil.getSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		Employee employee = new Employee(7L, "郑七", "007", new BigDecimal("1700"), 10L);
		employeeMapper.update(employee);
		
		//提交
		session.commit();
		//释放资源
		session.close();
		System.out.println(employee);
	}
	
	@Test
	public void testDelete() {
		SqlSession session = MyBatisUtil.getSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		
		Long[] id = new Long[]{1L,2L,4L};
		employeeMapper.delete(id);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	
	@Test
	public void testSave() {
		SqlSession session = MyBatisUtil.getSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		List<Employee> employee = new ArrayList<>();
		Employee e1 =  new Employee(null, "小天", "001", new BigDecimal("700"), 10L);
		Employee e2 =  new Employee(null, "小天", "001", new BigDecimal("700"), 10L);
		Employee e3 =  new Employee(null, "小天", "001", new BigDecimal("700"), 10L);
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		employeeMapper.save(employee);
		//提交
		session.commit();
		//释放资源
		session.close();
	}

	
	

}
